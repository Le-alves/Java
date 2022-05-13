package principal;

import componentes.*;

public class TestadorCarro {
	
	public static void main (String[] args) {
		
		 Carro CarroCamp = new Carro();
		 CarroCamp.setPlaca("xxx-000");
		 CarroCamp.setCor ("Azul bebe");
		 CarroCamp.setValor(5000);
		 CarroCamp.setQntPneu(5);
		 CarroCamp.setModelo("Nova Geração");
		 
		// System.out.println("A placa do carro e: " + CarroCamp.Placa);
		//System.out.println("Ele esta custando: "+ CarroCamp.Valor);
		 
		 Carro CarroGrace = new Carro();
		 CarroGrace.setCor("Oncinha");
		 CarroGrace.setPlaca("GRACE");
		 CarroGrace.setValor(1000000);
		 
		 //System.out.println("A cor do carro e: "+ CarroGrace.Cor);
		 //System.out.println("A cor do carro e: "+ CarroGrace.Placa);
		 //System.out.println("A cor do carro e: "+ CarroGrace.Valor);
		 
		 //System.out.println(CarroGrace.EstarLigado());
		 
		 //CarroGrace.Ligar();
		 //System.out.println(CarroGrace.EstarLigado());
		 //CarroGrace.Desligar();
		 //System.out.println(CarroGrace.EstarLigado());
		 
		 System.out.println("A placa do carro e: "+ CarroCamp.getPlaca());
		 System.out.println("A placa do carro e: "+ CarroGrace.getPlaca());
	
	} 
}

