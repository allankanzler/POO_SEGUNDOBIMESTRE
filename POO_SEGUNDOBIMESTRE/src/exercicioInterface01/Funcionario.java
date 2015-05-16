package exercicioInterface01;

public abstract class Funcionario {
	protected  String cargo;
	protected int matricula;
	protected double salario;
	
	public Funcionario(String cargo, int matricula, double salario) {
		super();
		this.cargo = cargo;
		this.matricula = matricula;
		this.salario = salario;
	}
}
