

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {


public boolean confirma(String n, String c){
	Connection con = null;
	con = ConexaoMySQL.getConexao();
	if(con != null){
		String nam = n;
		String nome = "";
		String sql = "SELECT * from AUTENTICA where usuario=? AND senha=?";
		PreparedStatement pstm;
		try {
			pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, n);
			pstm.setString(2, c);
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