package model;

import java.awt.geom.Arc2D.Double;

public class Empregado {

	private String cpf;
	private String nome;
	private String enderco;
	private double salario;
	
	public Empregado() {
		
	}
	
	
	public Empregado(String cpf, String nome, String enderco, double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.enderco = enderco;
		this.salario = salario;
	}


	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderco() {
		return enderco;
	}
	public void setEnderco(String enderco) {
		this.enderco = enderco;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double sal) {
		this.salario = sal;
	}
	
	
}
