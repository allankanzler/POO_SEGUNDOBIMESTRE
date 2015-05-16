package exercicioInterface01;

public class Diretor extends Lider{

	public Diretor(String cargo, int matricula, double salario, String login,
			String senha) {
		super(cargo, matricula, salario, login, senha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void logarNoSistema() {
		System.out.println(cargo+" logou");
		
	}


	
	

}
