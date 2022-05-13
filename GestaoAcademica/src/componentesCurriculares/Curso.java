package componentesCurriculares;

public abstract class Curso {
	private String Modalidade;
	private int Duracao;
	private int NumeroVagas;
	private String Turno;
	private String Campus;
	
	public abstract String getNome(); // todas classes que herdam, irão necessitar criar esse método para manipular
	
	public void setModalidade(String modalidade) {
		this.Modalidade = modalidade;
	}
	public String getModadelidade () {
		return Modalidade;
	}
	
	public void setDuracao (int duracao) {
		this.Duracao = duracao;
	}
	public int getDuracacao() {
		return Duracao;
	}

	public void setNumeroVagas(int numero) {
		this.NumeroVagas = numero;
	}
	public int getNumeroVagas() {
		return NumeroVagas;
	}
	
	public void setTurno(String turno) {
		this.Turno = turno;
	}
	public String getTurno() {
		return Turno;
	}
	
	public void setCampus(String campus) {
		this.Campus = campus;
	}
	public String getCampus() {
		return Campus;
	}
	
	public abstract void EscreveNaTela();
}

