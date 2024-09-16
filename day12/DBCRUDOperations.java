package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCRUDOperations {
	public static void main(String[] args) throws ClassNotFoundException {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/mycollege";
		Class.forName("com.mysql.cj.jdbc.Driver");
		String insertrecord="insert into students values (?,?,?,?,?)";
		String selectrecords="select * from students";
		
		try {
			con=DriverManager.getConnection(url,"root","Acts@Batch#2024");
			PreparedStatement pst=con.prepareStatement(insertrecord);
			pst.setInt(1,14);
			pst.setString(2,"Ananya");
			pst.setString(3,"N");
			pst.setInt(4,2);
			pst.setInt(5,83);
			int count=pst.executeUpdate();
			System.out.println(count + "row(s) affected");
		}catch (SQLException e) {
			System.out.println(e);
		}
		try {
			con=DriverManager.getConnection(url,"root","Acts@Batch#2024");
			Statement st=con.createStatement();
			ResultSet records=st.executeQuery(selectrecords);
			while(records.next())
			{
				System.out.println(records.getInt(1)+","+records.getString(2)+","+records.getString(3)+","+records.getInt(4)+","+records.getInt(5));
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
	}

}
