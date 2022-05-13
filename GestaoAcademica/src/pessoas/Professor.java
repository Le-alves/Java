package pessoas;

public class Professor extends Pessoa{
	
	private String Titulacao;
	private float Salario;
	
	public void setTitulacao(String titulacao) {
		this.Titulacao = titulacao;
	}
	public String getTitulacao() {
		return this.Titulacao;
	}
	public void setSalario(float salario) {
		this.Salario = salario;
	}
	public float getSalario() {
		return this.Salario;
	}
	
	@Override
	public void EscreveNaTela() {
		
		super.EscreveNaTela();
		System.out.println("Sua titutacaoo: "+ this.getTitulacao());
		System.out.println("Seu salario e: "+ this.getSalario());
	}

}
