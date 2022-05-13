package componentesCurriculares;

public class Disciplina {

	
	private String nome;
	private String ementa;
	private String bibliografia;
	private int cargaHoraria;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String Nome) {
		if (this.nome != null)
			System.out.println("Nome da disciplina ja foi definido");
		else
			this.nome = Nome;
	}
//-------------
	
	public String getEmenta() {
		return ementa;
	}
	public void SetEmenta (String Ementa) {
		this.ementa = Ementa;
	}
//-------------
	
	public String getBibliografia() {
		return bibliografia;
	}
	public void SetBiliografia (String Bibliografia) {
		this.bibliografia = Bibliografia;
	}
//-------------
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void SetCargaHoraria(int CargaHoraria) {
		this.cargaHoraria = CargaHoraria;
	}
}
