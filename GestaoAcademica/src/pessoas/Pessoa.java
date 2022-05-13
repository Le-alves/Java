package pessoas;

public class Pessoa {
	private String Cpf;
	private String Nome;
	private String Endereco;
	
	public void setCpf(String cpf) {
		this.Cpf = cpf;
	}
	public String getCpf() {
		return this.Cpf;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getNome() {
		return this.Nome;
	}
	
	public void setEndereco(String endereco) {
		this.Endereco = endereco;
	}
	public String getEndereco() {
		return this.Endereco;
	}
	
	public void EscreveNaTela() {
		System.out.println("----------------------------------");
		System.out.println("O nome e: " + this.getNome());
		System.out.println("O cpf e: " + this.getCpf());
		System.out.println("O endereco e: " + this.getEndereco());
	}
}
