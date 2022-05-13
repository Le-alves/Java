package ex2;

public class Testador {
	public static void main (String[] args) {
		
		Cliente C1 = new Cliente();
		C1.setAnoNascimento(1992);
		C1.setIdade(29);
		C1.setNome("Pedro");
		C1.setSexo("M");
		C1.setValorDvida(45.48);
		System.out.println(C1.ToString());
		
		Gerente G1 = new Gerente();
		G1.setNome("Gustavo");
		G1.setIdade(55);
		G1.setMatricula("5478-85");
		G1.setNomeGerencia("Pinheiros");
		System.out.println(G1.ToString());
		
		Vendedor V1 = new Vendedor("Joao");
		V1.setSalario(854.45);
		V1.setValorVendas(45);
		V1.setQntVendas(75);
		System.out.println(V1.ToString());
		
	}

}
