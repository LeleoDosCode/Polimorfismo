package Funcionario;

public class Horista extends Funcionario{
	
	Horista(int id,String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	
	@Override
	public double calculaSalario(double salarioHora, double horasTrabalhadas, double imposto) {
		return salarioHora*horasTrabalhadas;
	}
}
