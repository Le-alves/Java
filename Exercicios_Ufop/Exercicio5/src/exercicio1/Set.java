package exercicio1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Set {

	ArrayList<String> ListaNomes;
	
	public static boolean PesquisarNome(String lista[], String nomeprocurado) {	
		for(int i = 0; i < lista.length ; i++) {
			if(nomeprocurado.equals(lista[i]))
				return true;
		}
		return false;
	}
	
	void Set(String nome) { 
		
		
	}
	
	}
