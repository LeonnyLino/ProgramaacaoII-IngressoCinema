package model;

public class Funcionario {
	private String login, senha;

	public Funcionario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	
	public Funcionario() {}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Funcionario [login=" + login + ", senha=" + senha + "]";
	}
	
	
	
}
