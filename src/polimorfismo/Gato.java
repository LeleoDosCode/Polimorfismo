package polimorfismo;

public class Gato extends Animal{
	
	Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Miando");
	}
}
