package Classes;

public class AreaCirc {
	double raio;
	final static double PI = 3.14;//FINAL É UM MODIFICADOR PRA DEFINIR UMA CONSTANTE; AGORA VC DEIXA O PI MAIUSCULO; AGORA EU NAO 
	//CONSIGO ALTERA O VALOR DA VARIAVEL;
   
	AreaCirc(double raioInicial ) { //CONTRUTOR NAO TEM TIPO;
	
		raio = raioInicial;
	}
	
	double area () { //METODO PQ TEM UM TIPO (DOUBLE NESSE CASO);
		return raio * raio * PI;// FORMULA DO PI;
	}
	
	
	
	
}
