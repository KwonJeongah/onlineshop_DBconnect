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
			System.out.println("�����ͺ��̽� ���� ����");
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public void requestExitProgram() {
		if(conn != null) {try {conn.close();} catch(SQLException e) {e.printStackTrace();}}
		System.out.println("���α׷� ����");
		System.exit(0);
	}
}
