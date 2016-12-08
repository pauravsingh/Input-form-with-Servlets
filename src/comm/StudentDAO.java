package comm;
import java.sql.*;
import java.util.ArrayList;

public class StudentDAO 
{
	public Connection getConnection()
	{
		Connection con = null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} 
		catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g","psurendr","uzalsi");
			
		}
		catch(SQLException e)
			{
				System.out.println("JDBC ERROR : \n");
				e.printStackTrace();
			}
		return con;
		
	}
	public void addStudent(int student_id, String student_name, String student_address, String student_city,
			String student_state, int student_zipcode, String student_phone, String student_email, String student_url,
			String student_grad, String student_date, String student_recom, String student_source,
			String gmu_features, String student_comments) throws SQLException 
	{
		Connection con = getConnection();
		String insertQuery= "INSERT INTO student(student_id,student_name,student_address,student_city,student_state,student_zipcode,student_phone,student_email,student_url,student_grad, student_date, student_recom, student_source, gmu_features, comments)"+
					"VALUES("+student_id+",'"+student_name+"','"+student_address+"','"+student_city+"','"+student_state+"',"+student_zipcode+",'"+student_phone+"','"+student_email+"','"+student_url+"','"+student_grad+"','"+student_date+"','"+student_recom+"','"+student_source+"','"+gmu_features+"','"+student_comments+"')";
		Statement stmt1 = con.createStatement();
		stmt1.executeQuery(insertQuery);
	}
	
	public StudentBean getStudent(int student_id) throws SQLException
	{
		Connection con = getConnection();
		StudentBean sData = new StudentBean();
		String getQuery = "SELECT * FROM student WHERE student_id="+student_id; 
		Statement stmt2 = con.createStatement();
		ResultSet rs = stmt2.executeQuery(getQuery);
		if(rs.next())
		{
			sData.setStudent_id(rs.getInt("student_id"));
			sData.setStudent_name(rs.getString("student_name"));
			sData.setStudent_address(rs.getString("student_address"));
			sData.setStudent_city(rs.getString("student_city"));
			sData.setStudent_state(rs.getString("student_state"));
			sData.setStudent_zipcode(rs.getInt("student_zipcode"));
			sData.setStudent_phone(rs.getString("student_phone"));
			sData.setStudent_email(rs.getString("student_email"));
			sData.setStudent_url(rs.getString("student_url"));
			sData.setStudent_grad(rs.getString("student_grad"));
			sData.setStudent_recom(rs.getString("student_recom"));
			sData.setStudent_date(rs.getString("student_date"));
			sData.setStudent_source(rs.getString("student_source"));
			sData.setStudent_comments(rs.getString("comments"));
			sData.setGmu_features(rs.getString("gmu_features"));
		}
		return sData;
	}
	
	public ArrayList<Integer> StudentList() throws SQLException
	{
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		Connection con = getConnection();
		String listQuery = "SELECT student_id FROM student";
		Statement stmt3 = con.createStatement();
		ResultSet rs = stmt3.executeQuery(listQuery);
		
		while(rs.next())
		{
			list.add(rs.getInt("student_id"));
			i++;
		}
		return list;
	}
		
	
}
