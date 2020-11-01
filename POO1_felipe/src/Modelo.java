

public class Modelo {

	private String nome;
	private String senha;
	
	public Modelo(String n, String s){
		this.nome = n;
		this.senha = s;
	}
	
	public Modelo(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}

