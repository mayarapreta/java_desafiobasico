package trilha_java_basico;
import java.util.Scanner;


public class apple {
	
		public static void main(String[] args) {
		/*	String Repodutor =  "Musicial";
			
			
			if(Repodutor == "Musicial" )
				System.out.println("tocar");
			
				
			else if(Repodutor ==  "Musicial")
			
				System.out.println("pausa");
				
			else if ( Repodutor == "Musicial")
			
				System.out.println("selecionarMusica");
		
				*/
	String sigla = "telefone";

	switch (sigla) {
	
	case "ligar": {
		System.out.println("ligando ");
		break;
	}
	case "atender":{
		System.out.println("atendendo");
		break;
	}
	case " voz":{
		System.out.println("iniciarCorrerioVoz");
		break;
	}
	default:
		System.out.println("INDEFINIDO");
	}
		
	
}
}
	
		
	
