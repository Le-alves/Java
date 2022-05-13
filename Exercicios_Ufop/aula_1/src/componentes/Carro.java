package componentes;

public class Carro {
	
	private String Placa;
	private String Cor;
	private int QntPneus;
	private float Valor;
	private String modelo; 
	//Propriedades(atributos) do carro 

	private boolean EstarLigado =  false; // Todo carro irá iniciar desligado
	
	public void Ligar() {
		this.EstarLigado = true;
	}
	
	public void Desligar() {
		this.EstarLigado = false;
	}
	 
	public boolean EstarLigado() { //Verificador para saber se o carro está desligado ou ligado
		return this.EstarLigado;
	}
	
	public void setPlaca (String placa) {
		this.Placa = placa; // propriedade Placa irá receber os dados presentes na string placa
	}
	public String getPlaca () {
		return this.Placa;
	}
	
	
	public void setCor (String cor) {
		this.Cor = cor; 
	}
	public String getCor () {
		return this.Cor;
	}
	
	
	public void setQntPneu(int qntPneus) {
		this.QntPneus = qntPneus;
	}
	public int getQntPneu() {
		return this.QntPneus;
	}
	
	
	public void setValor (float valor) {
		this.Valor = valor;
	}
	public double getValor() {
		return this.Valor;
	}
	
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	public String getmodelo() {
		return this.modelo;
	}
}	
