package cl.icap.fullstack.modulo4.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
	private Connection conn;
	private String url;
	private String password;
	private String username;

	public OracleConnection() {
		this.url = "jdbc:oracle:thin:@localhost:1521:xe";
		this.username = "hr";
		this.password = "1234";
	}
	
	public boolean openConn() {
		boolean retorno = false;
		
		try {
			 conn = DriverManager.getConnection(url, username, password);
			 retorno = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retorno;
	}
	
	public Connection getConn() {
		return this.conn;
	}
	
	public void closeConn() {
		try {
			this.conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
