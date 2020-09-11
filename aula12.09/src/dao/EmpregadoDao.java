package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Empregado;

public class EmpregadoDao {

	private Connection ccon=null;
	
	public  EmpregadoDao(){
		
	}
	public boolean consultaEmpregado(Empregado e) {
		String nome=null, end=null;
		double sal=0;
		
		String sql = "select * from empregado where cpf like ?";
		PreparedStatement prepS;
		
		try {
			prepS = ccon.prepareStatement(sql);
			prepS.setString(1, e.getCpf());
			ResultSet res= prepS.executeQuery();
			
			while(res.next()) {
				nome=res.getString(2);
				end=res.getString(3);
				sal=res.getDouble(4);
			}
			e.setNome(nome);
			e.setEnderco(end);
			e.setSalario(sal);
			ccon.close();
			
			return true;
		} catch (Exception e1) {
			// TODO: handle exception
		}
		
		
		
		return false;
		
	}
	
	
	
}
