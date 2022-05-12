package OO.heranca.teste.encapsulamento;

import OO.heranca.Direcao;
import OO.heranca.Heroi;
import OO.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro ();
		monstro.x = 10;
		monstro.y = 10;		
		
		Heroi heroi = new Heroi (10, 11);
		//heroi.x = 10;
		//heroi.y = 10;		
		
		//Jogador j1 = new Jogador();
		//j1.andar(Direcao.NORTE);
		//j1.andar(Direcao.LESTE);
		//j1.andar(Direcao.NORTE);
		//j1.andar(Direcao.LESTE);
		
		System.out.println("Monstro tem ==> " + monstro.life);
		System.out.println("Heroi tem ==> " + heroi.life);
		System.out.println();
		//System.out.println(monstro.life);
		//System.out.println(heroi.life);
		//monstro.andar(Direcao.NORTE);
		heroi.andar(Direcao.SUL);
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		heroi.atacar(monstro);


		monstro.atacar(heroi);
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		
		System.out.println("Monstro tem ==> " + monstro.life);
		System.out.println("Heroi tem ==> " + heroi.life);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
