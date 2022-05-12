package OO.Composiçao;

public class MotorEx1pra1 {
	boolean ligado = false;
	double fatorInjecao = 1;
	
	
	int giros () {
	if (!ligado) {
		return 0;
	}else {
			return (int) fatorInjecao * 3000;
		}
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

