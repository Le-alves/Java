package ex2;

public class Cliente extends Pessoa {
	
	private double ValorDvida;
	private int AnoNascimento;
	
	public double getValorDvida() {
		return ValorDvida;
	}
	public void setValorDvida(double valorDvida) {
		ValorDvida = valorDvida;
	}
	
	public int getAnoNascimento() {
		return AnoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		AnoNascimento = anoNascimento;
	}
	
	public String ToString() {
		return "Seu nome e:  "+super.getNome() + "\nSua idade: "+ getAnoNascimento() + "\nSeu sexo: "+ super.getSexo()+
				"\nNecessita pagar: "+ getValorDvida() + "\nNasceu no ano de: " + getAnoNascimento();
	}
}
