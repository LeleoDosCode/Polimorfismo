package Funcionario;

public class PessoaJuridica extends Funcionario{
	
	PessoaJuridica(int id,String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	
	@Override
	public double calculaSalario(double salarioHora, double horasTrabalhadas, double imposto) {
		return (salarioHora*horasTrabalhadas)-imposto;
	}
}
