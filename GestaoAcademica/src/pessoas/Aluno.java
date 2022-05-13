package pessoas;
import componentesCurriculares.*;

public class Aluno extends Pessoa {
	
	private String Matricula;
	private String Curso;
	
	private Disciplina disciplina; 				//criando Default, tem acesso quem está no mesmo pacote
												//Disciplina está fazendo referencia a classe que está no pacote ComponenteCurriculares| é uma variavel que armazena dados como outra qualquer. Não é um obj para ser estanciado. 
	
	private String[] ListaDisciplinas = new String[10];
	private int IndiceDisciplina = 0;
	
	public void setMatricula (String matricula) {
		if (ValidarMatricula(matricula))
			this.Matricula = matricula;
		else
			System.out.println("Matricula informada e invalida! " + matricula);
	}
	private boolean ValidarMatricula (String mat) { 
		if(mat == "" || mat == null)
			return false;
		
												//teste p saber se matricula tem os números no formato certo
		String var[] = mat.split("\\.");        // irá dividir os numeros (q estão armmazenados como string), em um array de 3 locais  
		if (var.length != 3)
			return false;
		
		int ano = Integer.parseInt(var[0]); // irá transformar o primeiro array em int para pder comparar no if 
		if (ano < 2000 || ano > 2020) {     //não se pode comparar char com int 
			return false;
		}
		
		return true;
	}
	
	public String GetMatricula() {
		return this.Matricula;
	}
	
	public Aluno(String mat, String nome) { //método construtor.
											
		setMatricula(mat); 
		super.setNome(nome);
	}
	
	public void SetCurso (String curso) {
		this.Curso = curso;
	}
	public String GetCurso() {
		return this.Curso;
	}
	
	public void Matricular(String disciplina) {
		if (this.TesteMesmaDisciplina(disciplina)) {
			System.out.println("O aluno ja esta matriculado na disciplina "+ disciplina);
			return; 								// para sair do if e não fazer os outros comandos 
		}
		if (IndiceDisciplina < 10) {
			this.ListaDisciplinas[IndiceDisciplina] = disciplina;
			IndiceDisciplina++;
		}else {
			System.out.println("O aluno ja esta matriculado em 10 disciplinas");
		}
	}
	
	public boolean TesteMesmaDisciplina(String disciplina) {
		for(int i = 0; i < IndiceDisciplina; i++) { 	//Contador para passar por toda a lista das disciplinas do aluno
			if (this.ListaDisciplinas[i].equals(disciplina)) // se em algum espaço elea aparecer igual a proxima disciplina, irá resultar em um true
				return true; 							//se a disciplina que está no array for igual a que está sendo passada como parâmetro, ira resultar em verdadeiro
		}
		return false; 									// caso percorra toda a lista e não encontre nada, ele irá retornar falso 
	}
	
	public String[] DisciplinasCursadas() {
		String disc[] = new String[IndiceDisciplina];
		int cont = 0;
		while (cont < disc.length) { 					// disc recebe os espaços e que estão em indice(10)
			disc[cont] = this.ListaDisciplinas[cont];
			cont++;
		}
		return disc;
	}
	
	public void setDisciplina (Disciplina disc) {
		if(this.disciplina != null) 					// Essa condição está se referindo a disciplina criada lá em cima, não sobre a disc criada para esse método
			System.out.println("Aluno ja matriculado em uma disciplina!");
		else
			this.disciplina = disc;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	@Override
	public void EscreveNaTela() {
		
		super.EscreveNaTela();
		System.out.println("Sua matricula e: "+ this.GetMatricula());
		System.out.println("Esta matriculado nas disciplinas: "+ this.disciplina.getNome());
	}
	
}
