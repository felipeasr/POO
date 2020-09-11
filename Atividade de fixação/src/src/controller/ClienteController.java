package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.ClienteDAO;
import model.Cliente;
import view.JanelaPrincipal;

public class ClienteController implements ActionListener {
	JanelaPrincipal janp;
	ClienteDAO cDAO;
	Cliente cliente;

	public ClienteController(JanelaPrincipal janp, Cliente cliente) {
		super();
		this.janp = janp;
		this.cDAO = new ClienteDAO();
		this.cliente = cliente;
		this.janp.getBtGravar().addActionListener(this);
		this.janp.getBtLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Limpar")) {
			limpar();
		}

		if (e.getActionCommand().equals("Pesquisar")) {
			System.out.println(this.janp.getTfCPF().getText());
			Cliente c = cDAO.pesquisar(this.janp.getTfCPF().getText());
			this.janp.getTfNome().setText(c.getNome());
			if (c.getSexo().equals("M")) {
				this.janp.getRbMasc().setSelected(true);
				this.janp.getRbFem().setSelected(false);
			} else {
				this.janp.getRbMasc().setSelected(false);
				this.janp.getRbFem().setSelected(true);
			}
			this.janp.getTfEndereco().setText(c.getEndereco());
			if (c.getProfissão().equals("Médico")) {
				this.janp.getCbProfissao().setSelectedIndex(2);
			} else {
				this.janp.getCbProfissao().setSelectedIndex(1);
			}
		}

	}

	private void limpar() {
		this.janp.getTfCPF().setText("");
		this.janp.getTfEndereco().setText("");
		this.janp.getTfNome().setText("");
		this.janp.getBtGroup().clearSelection();
		this.janp.getCbProfissao().setSelectedIndex(0);
	}

}
