package Funcionario;

public class Principal {
	
	public static void main(String[] args) {
		
		Jornada jornada = new Jornada(1, "Richard", "(15)99887-7665", 9999, "Itapetininga");
		System.out.println(jornada.calculaSalario(18, 192, 1800));

		Horista horista = new Horista(1, "Richard", "(15)99887-7665", 9999, "Itapetininga");
		System.out.println(horista.calculaSalario(18, 192, 1800)); 
		
		PessoaJuridica pJuridica = new PessoaJuridica(1, "Richard", "(15)99887-7665", 9999, "Itapetininga");
		System.out.println(pJuridica.calculaSalario(18,192,1800));

	}

}
