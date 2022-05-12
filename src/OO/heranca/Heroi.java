package OO.heranca;

public class Heroi extends Jogador {
// USANDO A PALAVRA EXTENDS VC RECEBE ATRIBUTOS E COMPORTAMENTOS POR HERANÇA;
	
	public Heroi (int x, int y) {
		super(x, y);
	}
	
	
	@Override
	public boolean atacar (Jogador jogador) {
		boolean ataque1 = super.atacar(jogador);
		boolean ataque2 = super.atacar(jogador);
		boolean ataque3 = super.atacar(jogador);
		return ataque1 || ataque2 || ataque3; 
		
		
		
		
	}

	    /**boolean atacar(Jogador adversario) {
		
		int deltaX = Math.abs(x - adversario.x);
		int deltaY = Math.abs(y - adversario.y);
		
		if (deltaX == 0 && deltaY == 1) {
			adversario.life -= 20;
			return true;
		}else if (deltaX == 1 && deltaY == 0) {
			adversario.life -= 20;
		return true;
		}else {
			return false;
		}
		
	}**/
	
	
	
	
	
	
}
