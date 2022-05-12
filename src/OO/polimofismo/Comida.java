package OO.polimofismo;

public abstract class Comida {
// essa classe na pode ser instanciada
	private double peso;

	public Comida(double peso) {
		setPeso(peso);

	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {

			this.peso = peso;
		}
	}

}
