package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.PreparedStatementWrapper;


public class DAO {


public boolean Autenticar_user(String n, String s){
	Connection con = null;
	con = ConexaoMySQL.getConexao();
	if(con != null){
		String nam = n;
		String nome = "";
		String sql = "SELECT * from AUTENTICA where usuario=? AND senha=?";
		PreparedStatementWrapper pstm;
		try {
			pstm = (PreparedStatementWrapper) con.prepareStatement(sql);
			pstm.setString(1, n);
			pstm.setString(2, s);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				nome = rs.getString(1);
			}
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	} else{
		return false;
	}
	
}
}