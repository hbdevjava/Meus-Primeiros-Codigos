package generics;

public class Caixa<HB> {
	private HB coisa;

	public void aguardar(HB coisa) {
		this.coisa = coisa;
	}

	public HB abrir() {
		return coisa;
	}

}
