package Funcionario;

public class Funcionario {

		private int id;
		private String nome;
		private String telefone;
		private int matricula;
		private String endereco;
		private double salarioHora;
		private double horasTrabalhadas;
		private double imposto;		
		
		public Funcionario(int id, String nome, String telefone, int matricula, String endereco) {
			this.id = id;
			this.nome = nome;
			this.telefone = telefone;
			this.matricula = matricula;
			this.endereco = endereco;
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		

		public double getSalarioHora() {
			return salarioHora;
		}

		public void setSalarioHora(double salarioHora) {
			this.salarioHora = salarioHora;
		}

		public double getHorasTrabalhadas() {
			return horasTrabalhadas;
		}

		public void setHorasTrabalhadas(double horasTrabalhadas) {
			this.horasTrabalhadas = horasTrabalhadas;
		}

		public double getImposto() {
			return imposto;
		}

		public void setImposto(double imposto) {
			this.imposto = imposto;
		}

		public double calculaSalario(double salarioHora, double horasTrabalhadas, double imposto) {
			this.salarioHora = salarioHora;
			this.horasTrabalhadas = horasTrabalhadas;
			this.imposto = imposto;
			return salarioHora*horasTrabalhadas*imposto;
		}
}
