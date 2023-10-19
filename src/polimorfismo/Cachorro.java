package polimorfismo;

public class Cachorro extends Animal{
	
	Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Latindo");
	}
}
