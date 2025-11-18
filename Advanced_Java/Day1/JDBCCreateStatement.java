package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class JDBCCreateStatement {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url ="jdbc:mysql://192.168.10.117:3306/dac5?useSSL=false";
			conn=DriverManager.getConnection(url,"dac5","welcome");
			if(conn != null) {
				System.out.println("Connection is Done .");
			}else {
				System.out.println("Connection is not Done.");
			}
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from dept");
			
			while(rs.next()) {
				System.out.println("DeptNo : " + rs.getInt(1));
				System.out.println("Dept Name : " + rs.getString(2));
				System.out.println("Dept Location : " + rs.getString(3));
				System.out.println("Dept password : " + rs.getString(4));
				System.out.println("Dept started on : " + rs.getString(5));
				System.out.println("---------------------");
			}
			
			
			int deptno = 90;
			String deptName = "Core";
			String loc = "Pune";
			String pass = "pune@123";
			LocalDate ldt=LocalDate.now();
			String sqlDate = ldt.toString();
			String Query = "insert into dept values("+deptno+",'"+deptName+"','"+loc+"','"+pass+"','"+sqlDate+"')";
			System.out.println(Query);
			int n = st.executeUpdate(Query);
			if(n > 0) {
				System.out.println("Insertion is Done.");
			}else {
				System.out.println("Insertion is not Done.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
