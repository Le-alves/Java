package ex1;
import java.io.OutputStream;
import java.util.ArrayList;
import java.io.OutputStream;

public class Pessoa {
	
	private int idade;
	
	public Pessoa (int idade) {
		
	}
	
	public int GetIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return "Sua idade e: " + GetIdade() + "\n";
		}
	
	public void flush(OutputStream Out){
		Out.write(Pessoa.toString().getBytes());
	}
	

}
