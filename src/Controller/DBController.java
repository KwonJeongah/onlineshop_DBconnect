package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBController {
	private Connection conn;
	
	public DBController() {
		try {
			String url = "jdbc:mysql://localhost/shop?serverTimezone=UTC";
			String id = "shopmaster";
			String pw = "1234";
			conn = DriverManager.getConnection(url, id, pw);
		}catch(SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public void requestExitProgram() {
		if(conn != null) {try {conn.close();} catch(SQLException e) {e.printStackTrace();}}
		System.out.println("프로그램 종료");
		System.exit(0);
	}
}
