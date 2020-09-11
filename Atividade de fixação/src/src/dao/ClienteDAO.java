package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.Conexao;
import model.Cliente;

public class ClienteDAO {

	public Cliente pesquisar(String cpf) {
		Conexao.abrirConexao();
		Cliente c = new Cliente();
		String query = "select c.* from cliente c where cpf = ?";

		try {
			PreparedStatement preparedStmt = Conexao.con.prepareStatement(query);
			preparedStmt.setString(1, cpf);
			ResultSet res = preparedStmt.executeQuery();
			res.next();
			c.setCpf(cpf);
			c.setEndereco(res.getString("endereco"));
			c.setNome(res.getString("nome"));
			c.setSexo(res.getString("sexo"));
			c.setProfissão(res.getString("nome"));
			Conexao.fecharConexao();
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
