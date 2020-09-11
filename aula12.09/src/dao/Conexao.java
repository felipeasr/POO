package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static boolean status = false;
	public static Connection con = null;

	public static Connection abrirConexao() {

		String servername = "localhost";
		String database = "banco_aula";
		String user = "root";
		String password = "190599";
		String url = "jdbc:mysql://" + servername + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
		try {
			con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				status = true;
			} else {
				status = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public static Connection getCon() {
		return con;
	}

	public static void setCon(Connection con) {
		Conexao.con = con;
	}

	public static boolean fecharConexao() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}


	public void obterstatus() {
		System.out.print(status);
	}
	public static boolean getStatus() {
		return status;
	}
}
