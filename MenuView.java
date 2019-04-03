import javax.swing.*;  
class MenuView  
{  
          JFrame f;   
          JMenuBar mb;
          JMenu file, arith_op, point_op, masking, glob_op, color_mod, img_viewer ;  
          JMenuItem i1, i2, i3;
          JMenuItem a1, a2, a3, a4, a5, a6, a7;
          JMenuItem p1, p2, p3, p4;
          JMenuItem g1;
          JMenuItem c1, c2, c3;
          JTextArea ta;   

          MenuView(){  
          JFrame f= new JFrame("IMAGE PROCESSING");  
          JMenuBar mb=new JMenuBar();  
          file=new JMenu("File");    
          i1=new JMenuItem("Open");  
          i2=new JMenuItem("Save");  
          i3=new JMenuItem("Exit");

          arith_op=new JMenu("Arithmatic Operation");    
          a1=new JMenuItem("Add");  
          a2=new JMenuItem("Subtract");  
          a3=new JMenuItem("Multiply");
          a4=new JMenuItem("DIVIDE");  
          a5=new JMenuItem("AND");  
          a6=new JMenuItem("OR");
          a7=new JMenuItem("NOT");

          point_op=new JMenu("Point Operation");    
          p1=new JMenuItem("Brightening");  
          p2=new JMenuItem("Thresholding");  
          p3=new JMenuItem("Contrast Stretch");
          p4=new JMenuItem("Negative"); 

          masking=new JMenu("Masking Operation"); 

          glob_op=new JMenu("Global Operation");    
          g1=new JMenuItem("Histogram Equalisation"); 

          color_mod=new JMenu("Color Models");    
          c1=new JMenuItem("RGB");  
          c2=new JMenuItem("HSI");  
          c3=new JMenuItem("CMY");

          img_viewer=new JMenu("Image");

          file.add(i1); file.add(i2); file.add(i3);     
          mb.add(file); 
          arith_op.add(a1); arith_op.add(a2); arith_op.add(a3); arith_op.add(a4); arith_op.add(a5); arith_op.add(a6); arith_op.add(a7);     
          mb.add(arith_op);
          point_op.add(p1); point_op.add(p2); point_op.add(p3); point_op.add(p3); point_op.add(p4);    
          mb.add(point_op);
          mb.add(masking);
          glob_op.add(g1);     
          mb.add(glob_op);
          color_mod.add(c1); color_mod.add(c2); color_mod.add(c3);      
          mb.add(color_mod);
          mb.add(img_viewer);

          ta=new JTextArea();    
          ta.setBounds(5,10,700,320);    
          f.add(mb);f.add(ta);        
          f.setJMenuBar(mb);  
          f.setSize(600,450);  
          f.setLayout(null);  
          f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MenuView();  
}}  