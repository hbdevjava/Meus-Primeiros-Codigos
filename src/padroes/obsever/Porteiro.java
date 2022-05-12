package padroes.obsever;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ObservadorChegadaAniversariante> observadores
			= new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		while(!"Sair".equalsIgnoreCase(valor)){
			System.out.print("O aniversariante Chagou? ");
			valor = entrada.nextLine();
		if("Sim".equalsIgnoreCase(valor)) {
			// CRIAR O EVENTO
			EventoChegadaAniversariante evento 
				= new EventoChegadaAniversariante(new Date());	
			// NOTIFICAR OS OBSERVADORES!
			observadores.stream()
			.forEach(observador -> observador.chegou(evento));
			valor = "Sair";
			
		}else{
			System.out.println("Alarme falso!!!");
		}
	}
	
		entrada.close();
	}

	
}
