package exercicioInterface01;

public class Tester {
	public static void main(String[] args) {
			
		SistemaGerencial sistema = new SistemaGerencial();
		IUsuarioDoSistema diretor = new Diretor("diretor", 1, 1200, "allan", "fdafa");
		
		sistema.fazLogin(diretor);
		IUsuarioDoSistema consultor = new Consultor("Zélio", "consultor45");
		sistema.fazLogin(consultor);	
	
	}


}
