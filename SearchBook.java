import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.Toolkit;


public class SearchBook extends JFrame implements ActionListener
{
	private JLabel lbl_id, lbl_bname, lbl_price;
	private JTextField txt_id, txt_bname, txt_price;
	private JButton but_search;
	private JPanel panel_search, panel_result;

	private DBase db = null; 

	private Container contepane;

	SearchBook(String title)
	{
		super(title);
		contepane = getContentPane();
		/*********** Search Panel**********/	
		panel_search = new JPanel();

		lbl_id = new JLabel("Book ID", JLabel.RIGHT);
		txt_id = new JTextField(20);
		but_search = new JButton("Search...");
		but_search.addActionListener(this);
		panel_search.add(lbl_id);
		panel_search.add(txt_id);
		panel_search.add(but_search);

		contepane.add(panel_search, BorderLayout.NORTH);

		/*********** Result Panel**********/	
		panel_result = new JPanel();
		panel_result.setLayout(new GridLayout(2,2, 0,20));
		//panel_result.setLayout(new FlowLayout());
	
		lbl_bname = new JLabel("Book Name", JLabel.RIGHT);
		lbl_price = new JLabel("Price", JLabel.RIGHT);
		txt_bname = new JTextField(20);
		txt_price = new JTextField(20);

		panel_result.add(lbl_bname);
		panel_result.add(txt_bname);
		panel_result.add(lbl_price);
		panel_result.add(txt_price);
			
		contepane.add(panel_result, BorderLayout.CENTER);		
		
		searchBookDetails();

		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				db.closeObject();
				System.exit(0);
			}
		});
		
		setSize(500, 200);
		setVisible(true);
	}

	public void searchBookDetails()
	{
		db = new DBase();
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "jdbc:mysql://localhost:3306/bookshop";

		if(db.loadDriver(driverName) != 1)
		{
			System.out.println("Not able load specified driver.....");
			return;
		}


		System.out.println("loaded driver successfully.....");

		if(db.createConnection(dbName) != 1)
		{
			System.out.println("Not able connect database.....");
			return;
		}

		System.out.println("Connection established.....");
		
		String sql = "select * from bookinfor where bookid = ?";

		if(db.prepareStatement(sql) != 1)
		{			
			System.out.println("Not able create prepareStatement object.....");
			return;
		}
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == but_search)
		{
			if(txt_id.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this, "Enter id....");
			}
			else
			{
				int id = Integer.parseInt(txt_id.getText());
				try
				{
				 	db.searchRecord(id);

					if(db.rs!=null)
					{
						db.rs.first();
						txt_bname.setText(db.rs.getString(2));
						txt_price.setText(String.valueOf(db.rs.getFloat(3)));
		
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "No record found....");
				}
			}
		
		}
	}

	public static void main(String[] args) {
	
		new SearchBook("Find book.....");
	}
	
}

