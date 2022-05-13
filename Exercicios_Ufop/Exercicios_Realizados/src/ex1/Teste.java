package ex1;

public class Teste {

	public static void main (String[] args) {
		
		Cachorro Ca = new Cachorro ("Caramelo");
		Ca.setPeso(45);
		Ca.setRaca("Vira-lata");
		System.out.println(Ca.ToString());
		
		
		Peixe Pe = new Peixe("Nemo");
		Pe.setPeso(0.25);
		Pe.setTiboHabitat("Agua salgada");
		System.out.println(Pe.ToString());
		
		}
}
