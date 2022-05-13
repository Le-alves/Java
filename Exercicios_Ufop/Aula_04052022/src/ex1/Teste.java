package ex1;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Teste {
	
	public static void main(String[] args) throws Exception {
		
		Container c = new Container();
		
		for(int i = 0; i < 10; i++) {
			c.Adicionar(new Pessoa(i));
		}
		
	
		OutputStream Out = new FileOutputStream("teste.txt");
		//c.print(System.out);
	}


}
