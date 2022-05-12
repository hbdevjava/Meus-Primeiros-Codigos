package OO.heranca.desafio;

public class Carro {
	int VELOCIDADE_MAXIMA;
	int velocidadeAtual;

	protected Carro(int VELOCIDADE_MAXIMA) {
		
		this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
	}

	public void acalerar() {
		if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA ) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {

		velocidadeAtual += 5;
	    }
	}
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	public void stop() {
		velocidadeAtual = 0;
	}

	public String toString() {
		return "Velocidade maxima é  " + velocidadeAtual + "KM/hr";
	}

}
