package ex2;

public class Vendedor extends Empregado {
	
	private double ValorVendas;
	private int QntVendas;
	
	public int getQntVendas() {
		return QntVendas;
	}
	public void setQntVendas(int qntVendas) {
		QntVendas = qntVendas;
	}
	
	public double getValorVendas() {
		return ValorVendas;
	}
	public void setValorVendas(double valorVendas) {
		ValorVendas = valorVendas;
	}
	
	public Vendedor (String nam) {
		super.setNome(nam);
	}
	
	public String ToString() {
		return "Seu nome e:  "+super.getNome() + "\nSeu salario: "+ super.getSalario() + "\nValor das suas vendas: "+ getValorVendas()+
				"\nVendeu o total de : "+ getQntVendas() + " pecas";
	}
}
