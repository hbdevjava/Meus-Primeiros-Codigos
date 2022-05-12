package Controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		//RARAMENTE USA O SWITCH SEM O BREAK;
		/**
		 * IF(BOOLEAN)...
		 * WHILE(BOOLEAN)...
		 * FOR(BOOLEAN)...
		 * TOLOWERCASE VC NAO PRECISA SE PREOCUPAR COM O TAMANHO DA FONTE;
		 */
		
		String faixa = "preta";
		switch (faixa.toLowerCase()) { 
		
		case "preta":
		System.out.println("Sei o Bassai-Dai...");
		case "marrom":
		System.out.println("Sei o tekki shodan");
		case "roxa":
		System.out.println("Sei o heian godan");
		case "verde":
		System.out.println("Sei o heian yodan");
		case "laranja":
		System.out.println("Sei o heian sandan");
		//break;
		case "vermalha":
		System.out.println("Sei o heian nidan");
		case "amarela":
		System.out.println("Sei o heian shodan");
		break;
		default:
			System.out.println("Sei de nada");	
		
		
		}
		
		System.out.println("fim");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
}
