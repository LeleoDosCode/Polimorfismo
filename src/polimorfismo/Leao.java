package polimorfismo;

public class Leao extends Animal{
	
	Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Rugindo");
	}
}
