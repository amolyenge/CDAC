package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class JDBCPrepared {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.117:3306/dac5?useSSL=false";
			conn = DriverManager.getConnection(url,"dac5","welcome");
			if(conn != null) {
				System.out.println("Connection isDone");
			}else {
				System.out.println("Connection is Not Done.");
			}
			
			PreparedStatement pst = conn.prepareStatement("select * from dept");
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				System.out.println("Dept No : " + rs.getInt("DEPTNO"));
				System.out.println("Dept Name : " + rs.getString("DNAME"));
				System.out.println("Dept Location : " + rs.getString("LOC"));
				System.out.println("Dept Password : " + rs.getString("PWD"));
				System.out.println("Dept Start Date : " + rs.getString("STARTEDON"));
				System.out.println("===============================================");
			}
			
			PreparedStatement pst1 = conn.prepareStatement("Insert into dept values(?,?,?,?,?)");
			int deptno = 120;
			String deptName = "Testing";
			String loc = "Pune";
			String pass = "dev@pune";
			LocalDate lt = LocalDate.now();
			String sqlDate = lt.toString();
			pst1.setInt(1, deptno);
			pst1.setString(2, deptName);
			pst1.setString(3, loc);
			pst1.setString(4, pass);
			pst1.setDate(5, java.sql.Date.valueOf(lt));
			int n = pst1.executeUpdate();
			
			if(n > 0) {
				System.out.println("Insertion is Done.");
			}else {
				System.out.println("Insertion is not done.");
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
