package ex2;

public class Gerente extends Empregado {
	
	private String NomeGerencia;

	public String getNomeGerencia() {
		return NomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		
		NomeGerencia = nomeGerencia;
	}
	
	public String ToString() {
		return "Seu nome e:  "+super.getNome() + "\nSua idade: "+ super.getIdade() + "\nNome Gerencia: "+ getNomeGerencia()+
				"\nO percentual do INSS: "+ super.valorInss();
	}

	

}
