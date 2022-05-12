package padroes.obsever;

public class Namorada implements ObservadorChegadaAniversariante {
	
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados");
		System.out.println("Apagar as Luzes");
		System.out.println("Silencio");
		System.out.println("Surpresa!!!!!");
	}
}
 

