package ex1;

public class Cachorro extends Animal {
		
	private String Raca;
	
	public Cachorro (String car) {
	super(car);
	}
	
	public void setRaca(String raca) {
		this.Raca = raca;
	}
	public String getRaca() {
		return Raca;
	}
	
	public String ToString() {
		return "Seu nome e:  "+super.getNome() + "\nSeu habitat: "+ getRaca() + "\nSeu peso: "+ super.getpeso();
	}
}
