package ex1;

public class Animal {

	private String Nome;
	private double Peso;
	
	public void setNome (String nome) {
		this.Nome = nome;
	}
	public String getNome () {
		return this.Nome;
	}
	
	public void setPeso(double peso) {
		this.Peso = peso;
	}
	public double getpeso() {
		return this.Peso;
	}
	
	public Animal (String nom) {
		setNome(nom);
	}
}
