package controle;

import modelo.Modelo;
import visao.Janela;

public class App {

	public static void main(String[] args) {
		Janela jan = new Janela();
		jan.setVisible(true);
		Modelo mo = new Modelo();
		
		Controle ctrl = new Controle(jan, mo);
	}
	
	
}
