package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);// SE NULL, ELA  CENTRALIZA NA TELA DO PC;
		
		JButton botao = new JButton("Clicar");
		janela.add(botao);
		//ActionListener ==> interface funcional
		botao.addActionListener(evento -> {
			System.out.println("Hebert e Alisson");
		});
		janela.setVisible(true);
	}
	
}
