package polimorfismo;

public class Lobo extends Animal{
	
	Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Uivando");
	}
}
