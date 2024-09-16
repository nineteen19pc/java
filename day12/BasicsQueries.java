package day12;
import java.sql.*;

public class BasicsQueries {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/mycollege";
		//jdbc:mysql://127.0.0.1:3306/?user=root
		String createTable = "CREATE TABLE students (\r\n"
				+ "    rollno INT AUTO_INCREMENT PRIMARY KEY,\r\n"
				+ "    firstname VARCHAR(50) NOT NULL,\r\n"
				+ "    lastname VARCHAR(50) NOT NULL,\r\n"
				+ "    deptid INT NOT NULL,\r\n"
				+ "    marks INT\r\n"
				+ ");\r\n"
				+ "" ;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			con=DriverManager.getConnection(url, "root","Acts@Batch#2024");
			Statement st= con.createStatement();
			int count= st.executeUpdate(createTable);
			System.out.println(count+"row(s) affected");
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}

}
