package exercicioInterface01;

public class SistemaGerencial  {
	
	public boolean fazLogin(IUsuarioDoSistema usuario){
		usuario.logarNoSistema();
		return true;
	}

}
