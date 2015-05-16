package exercicioInterface01;

public class Consultor implements IUsuarioDoSistema{

	private String senha;
	private String login;
	
	public Consultor(String senha, String login) {
		super();
		this.setSenha(senha);
		this.setLogin(login);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public void logarNoSistema() {
		System.out.println("Consultor logou");
		
	}
	
}
