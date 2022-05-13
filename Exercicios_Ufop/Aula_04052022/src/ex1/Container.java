package ex1;

import java.util.ArrayList;
import java.io.OutputStream;

public class Container {
	
	private ArrayList<Pessoa> ListadePessoas = new ArrayList();
	
	public void Adicionar (Pessoa p) {
		this.ListadePessoas.add(p);
	}
	
	public void print(OutputStream out) throws Exception {
		for(Pessoa pessoa : ListadePessoas) {
			out.write(pessoa.toString().getBytes());
			
		}
}
	}
