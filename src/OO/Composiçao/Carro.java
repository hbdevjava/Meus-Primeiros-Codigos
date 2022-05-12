package OO.Composiçao;

public class Carro {
	//QUANDO FOR RELAÇAO DE 1 PRA 1 NA CLASSE PRINCIPAL VC SO INSTANCIA 
	// A CLASSE PRIMARIA 
	MotorEx1pra1 motor = new MotorEx1pra1();
	
	void acalerar() {
		if (motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;	
	    }
	}
			
	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.5;
		}
	}
			
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
	
	
	
	
	
	
	
	
}
