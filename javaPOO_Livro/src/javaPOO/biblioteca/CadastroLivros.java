package javaPOO.biblioteca;

public class CadastroLivros {
	
	public static void main (String[]args) {
		
		Livro livro = new Livro();
		livro.SetNome("Alice no Pais das Maravilhas");
		livro.SetDescricao("aventura");
		livro.SetValor(15.50);
		
		Autor au = new Autor();
		au.SetNome("Alguem muito chapado");
		au.SetCpf("000.000.000-00");
		
		livro.autor = au;
		
		Livro livro2 = new Livro();
		livro2.SetNome("Jumanji");
		livro2.SetValor(10.50);
		livro2.SetDescricao("Fantasia");
		
		Autor au2 = new Autor();
		au2.SetNome("Irineu");
		au2.SetEmail("aaaaaaa@aaaa.com");
		au2.SetCpf("858.484.848-40");
		
		livro2.autor = au2;
		
	
		
	}

}
