package componentesCurriculares;

public class EngenhariaComputacao extends Curso {

	public String getNome() {
		return "Engenharia da computacao";
	}

	public void EscreveNaTela() {
		System.out.println("O nome do curso e : " + this.getNome());
	}
}
