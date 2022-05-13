package pessoas;
import componentesCurriculares.*;


public class CriaAluno {
	
	public static void main (String[] args) {
		
		//Aluno A1 = new Aluno("2021.2.85", "Bilubilu"); // método construtor
		
		
		//A1.SetCurso("Sistemas de Informacao");
		
//		System.out.println(A1.GetNome());
//		System.out.println(A1.GetCurso());
//		System.out.println(A1.GetMatricula());
		
		Aluno A2 = new Aluno("2020.2.85", "Maconha");// Ponto que serve como divisor para verificação 
		
		A2.SetCurso("Global");
		
//		System.out.println(A2.GetNome());
//		System.out.println(A2.GetCurso());
//		System.out.println(A2.GetMatricula());
		
//		A1.Matricular("CS1-542");
//		A1.Matricular("CS1-785");
//		String Lista[] = A1.DisciplinasCursadas(); // Criação de uma var para receber os dados e poder imprimir na tela
//		for(int i = 0; i < Lista.length; i++) {
//			System.out.println(Lista[i]);
//		}
		
//		A2.Matricular("MD - 420");
//		A2.Matricular("MD - 1111");
//		Lista = A2.DisciplinasCursadas(); 
//		for(int i = 0; i < Lista.length; i++) {
//			System.out.println(Lista[i]);
//		}
		
//		for (int i = 0; i < 10; i++) {
//			A2.Matricular("CSI8585");
//		}
		
		Disciplina D1 = new Disciplina();
		D1.setNome("Fundamentos do teste");
		D1.SetCargaHoraria(75);
		
		Pessoa[] listaDePessoas = new Pessoa[2];
		                                   		
		Pessoa pessoa = new Aluno("2020.2.0001", "Le Alves");
		
		((Aluno)pessoa).setDisciplina(D1);
		pessoa.setCpf("013.728.082-30");
		pessoa.setEndereco("Joao Monlevade");
		//Le.EscreveNaTela();
		
		listaDePessoas[0] = pessoa;
		
		Pessoa pessoas = new Professor();
		
		pessoas.setNome("Alter");
		((Professor)pessoas).setSalario(451);
		pessoas.setCpf("785465895");
		((Professor)pessoas).setTitulacao("professor");
		//Pro.EscreveNaTela();
		listaDePessoas[1] = pessoas;
		
		for (int i = 0; i < listaDePessoas.length; i++ ) {
			listaDePessoas[i].EscreveNaTela();
		}
	
	}

}
