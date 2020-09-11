package model;

public class Cliente {
	private String nome;
	private String sexo;
	private String cpf;
	private String profissão;
	private String endereco;

	public Cliente(String nome, String sexo, String cpf, String profissão, String endereco) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.profissão = profissão;
		this.endereco = endereco;
	}

	public Cliente() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissão() {
		return profissão;
	}

	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
