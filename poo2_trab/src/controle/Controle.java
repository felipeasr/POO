package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.DAO;
import modelo.Modelo;
import visao.Janela;

public class Controle implements ActionListener{

	private Janela jan;
	private Modelo mo;
	private DAO dao;
	
	public Controle(Janela j, Modelo m){
		this.jan = j;
		this.mo = m;
		dao = new DAO();
		
		this.jan.getBtnLimpar().addActionListener(this);
		this.jan.getBtnLogar().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Limpar")){
			this.jan.getFieldN().setText("");
			this.jan.getFieldS().setText("");
		}
		if(e.getActionCommand().equals("Logar")){
			boolean save = false;
			save = dao.confirma(jan.getFieldN().toString(), jan.getFieldS().toString());
			if(save == false){
				Object[] options = {"OK"};
				int a = JOptionPane.showOptionDialog(null, "Falha ao realizar login!", "Mensagem de Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, options, null);
			}
			if(save == true){
				Object[] options = {"OK"};
				int b = JOptionPane.showOptionDialog(null, "login realizado com sucesso!", "Mensagem", JOptionPane.OK_OPTION, JOptionPane.YES_OPTION, null, options, null);
			}
		}
	}
}
