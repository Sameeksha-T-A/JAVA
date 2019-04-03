import java.sql.*;

class DBase
{
	private Connection con;
	private PreparedStatement pstm;
	public ResultSet rs;

	public int loadDriver(String driver)
	{
		try
		{
			Class.forName(driver);
			return 1;	
		}
		catch(Exception e)
		{
			return -1;
		}
		//return -1;
	}

	public int createConnection(String dbname)
	{
		try
		{
			con = DriverManager.getConnection(dbname,"pooja1","12345");
			return 1;	
		}
		catch(Exception e)
		{
			System.out.println(e);
			return -1;
		}
	}

	public int prepareStatement(String sql)
	{
		try
		{
			pstm = con.prepareStatement(sql);
			return 1;	
		}
		catch(Exception e)
		{
			System.out.println(e);
			return -1;
		}
	}

	public void searchRecord(int id)
	{
		try
		{
			pstm.setInt(1,id);
			rs = pstm.executeQuery();	
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	public void closeObject()
	{
		try
		{
			pstm.close();
			rs.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}	
	}
}