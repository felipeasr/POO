

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

	
	private static String status = "STATUS: --> Não Conectado";
	private static Connection con  = null;
	
	public ConexaoMySQL(){
		
	}

	
	public static Connection getConexao(){
		//Connection con = null;
		
		String serverName = "localhost";
		String mydatabase = "Banco";
		String username = "root";
		String senha = "190599";
		String url = "jdbc:mysql://"+serverName+":3306/"+mydatabase;
		
		try {
			con =  DriverManager.getConnection(url, username, senha);
			
			if(con != null){
				status = "STATUS: Conectado com Sucesso!";
				System.out.println(status);
			}else{
				status = "STATUS: Não Conectado!";
				System.out.println(status);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;

	}
	
	public static boolean fecharConexao(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		ConexaoMySQL.getConexao();
	}

}