package OO.polimofismo;

public class Jantar {
	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.65);
		Arroz op1 = new Arroz(0.2);
		Feijao op2 = new Feijao(0.1);
		Carne op3 = new Carne(0.3);
		Comida op5 = new Carne(2.4);// COMO COMIDA ESTA ABSTRACT ELA NAO PODE SER INSTANCIADA;
		
		
		System.out.println(convidado.getPeso());

		convidado.comer(op1);
		convidado.comer(op2);
		convidado.comer(op3);
		convidado.comer(op5);

		System.out.println(convidado.getPeso());

		Sorvete op4 = new Sorvete(0.4);
		convidado.comer(op4);
		System.out.println(convidado.getPeso());

	}
}
