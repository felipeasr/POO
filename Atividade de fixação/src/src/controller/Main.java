package controller;

import java.io.IOException;

import model.Cliente;
import view.JanelaPrincipal;

public class Main {

	public static void main(String[] args) {
		try {
			JanelaPrincipal jan = new JanelaPrincipal();
			jan.setVisible(true);

			Cliente c = new Cliente();
			ClienteController con = new ClienteController(jan, c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
