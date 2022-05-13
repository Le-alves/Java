package ex2;

public class Empregado extends Pessoa {
	
	private double Salario;
	private String matricula;

	
	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		this.Salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double valorInss() {
		return this.Salario * 0.11;
	}
	
	
}
	


