package padroes.obsever;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservador(namorada);// ESTA CERTIFICANDO QUE ELA SERA AVISADA
		porteiro.monitorar();
		
		
		
		
	}
}
