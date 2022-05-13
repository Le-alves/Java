package javaPOO.biblioteca;

public class Autor extends Livro {
	
	private String Nome;
	private String Email;
	private String Cpf;
	
	public void SetNome(String nome)  {
		this.Nome = nome;
	}
	public String GetNome() {
		return this.Nome;
	}
	
	public void SetEmail(String email) {
		this.Email = email;
	}
	public String GetEmail() {
		return this.Email;
	}
	
	public void SetCpf (String cpf) {
		this.Cpf = cpf;
	}
	
	public String GetCpf() {
		return this.Cpf;
	}
	
	public void ImprimeNaTela() {
		
		System.out.println(Nome);
		System.out.println(Email);
		System.out.println(Cpf);
	}
	

}
