package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.EmpregadoDao;
import model.Empregado;
import view.janelaP;

public class EmpregadoControle implements ActionListener{

	private janelaP jan;
	private EmpregadoDao empd;
	
	
	
	public EmpregadoControle(janelaP j) {
		this.jan = j;
		this.jan.getBuscar().addActionListener(this);
	    empd = new EmpregadoDao();
	}
	
	public void consultarEmpregado() {
		String cpf = this.jan.getCpf().getText();
		Empregado emp = new Empregado(cpf,null,null,0);
		empd.consultaEmpregado(emp);
		
		this.jan.getNome().setText(emp.getNome());
		this.jan.getEnd().setText(emp.getEnderco());
		this.jan.getSal().setText(String.valueOf(emp.getSalario()));
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("consultar")) {
			consultarEmpregado();
		}
		
	}
	
	
	
	
	
}
