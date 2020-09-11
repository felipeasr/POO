package controller;

import java.io.IOException;

import dao.Conexao;
import view.janelaP;



public class Main {
	public static void main(String[] args) throws IOException {
		janelaP jan = new janelaP();
		jan.setVisible(true);
		Conexao cc = new Conexao();
		EmpregadoControle emp = new  EmpregadoControle(jan);

	}
}
