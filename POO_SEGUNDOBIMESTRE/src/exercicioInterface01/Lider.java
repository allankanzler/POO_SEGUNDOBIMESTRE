package exercicioInterface01;

public abstract class Lider extends Funcionario implements IUsuarioDoSistema {

	protected String login;
	protected String senha;
	
	public Lider(String cargo, int matricula, double salario, String login,
			String senha) {
		super(cargo, matricula, salario);
		this.login = login;
		this.senha = senha;
	}
}	
