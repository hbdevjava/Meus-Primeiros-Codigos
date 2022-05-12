package fundamentos.Conversoes;

import javax.swing.JOptionPane;//ALGO VISUAL, MOSTrA UM PROMPT;

public class ConversaoStringPraNumero36 {
	public static void main(String[] args) {
		//DIGITA JOp + CTRL + ESPAÇO = JOptionPane AE COLOCA .showInputDialog CHAMA UM PROMPT;
		String valo1 = JOptionPane.showInputDialog("digite o primeiro numero:");//7.9
		
		String valo2 = JOptionPane.showInputDialog("digite o segundo numero:");//8.3
		
		System.out.println(valo1 + valo2);
		//MOSTRA: 1.21.2 CONCATENAÇAO NAO TEM VALOR NUMERO AE E SIM UMA STRING;
		
		//CONVERTER STRING PRA NUMERO USA A FUNÇAO .parseDouble
		double num1 = Double.parseDouble(valo1);
		double num2 = Double.parseDouble(valo2);
		double soma = num1 + num2;
		System.out.println(soma);
		System.out.println("Media é: " + soma / 2);
		
		//CONSOLE:7.98.3
		//16.200000000000003
		//Media é: 8.100000000000001

		
		
		
		
		
	}
}
