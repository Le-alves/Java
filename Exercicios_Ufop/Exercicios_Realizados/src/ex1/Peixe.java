package ex1;

public class Peixe extends Animal{
	
	private String TipoHabitat;
	
	public void setTiboHabitat (String tipoHabitat) {
		this.TipoHabitat = tipoHabitat;
	}
	public String getTipoHabitat() {
		return TipoHabitat;
	}
	public Peixe (String nom) {
		super(nom);
	}
	
	public String ToString() {
		return "Seu nome e:  "+super.getNome() + "\nSeu habitat: "+ getTipoHabitat() + "\nSeu peso: "+ super.getpeso();
	}
}
