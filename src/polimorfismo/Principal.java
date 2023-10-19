package polimorfismo;

public class Principal {
	
	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Thor", "M", "Cinza");
		lobo.emitirSom();
		
		Leao leao = new Leao("Thor", "M", "Amarelo");
		leao.emitirSom();
		
		Cachorro cachorro = new Cachorro("Thor", "M", "Amarelo");
		cachorro.emitirSom();
		
		Gato gato = new Gato("Thor", "M", "Amarelo");
		gato.emitirSom();
		
		Tigre tigre = new Tigre("Thor", "M", "Amarelo");
		tigre.emitirSom();
	}

}
