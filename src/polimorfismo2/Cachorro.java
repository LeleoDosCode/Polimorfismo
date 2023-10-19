package polimorfismo2;

public class Cachorro implements Animal{
	
	@Override
	public void dormir() {
		System.out.println("Latindo");
	}
	@Override
	public void caminhar() {
		System.out.println("Latindo");
	}
	@Override
	public void correr() {
		System.out.println("Latindo");
	}
	@Override
	public void emitirSom() {
		System.out.println("Latindo");
	}
}
