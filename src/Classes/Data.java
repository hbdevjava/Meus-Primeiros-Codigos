package Classes;


public class Data {
		
	int dia;
	int mes;
	int ano;
	
	Data( ) {
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this (01, 01, 1970);//QUANDO USO O THIS (); COMO METODO QUER DIZER QUE VC TA CHAMANDO UM CONSTRUTOR
		//VC SO PODE USAR O THIS COMO METODO DENTRO DE OUTRO CONSTRUTOR;
		//VC CHAMA UM CONSTRUTOR A PARTIR DE OUTRO;
		
	}
	Data(int dai, int mes, int ano) {
		this.dia = dai;
		this.mes = mes;
		this.ano = ano;
	}
   
	
	//********* SAO DOIS METODOS DIFERENTES MAS COM A MESMA FUNÇAO***********
	// O METODO COM A STRINGE É O MAIS FLEXIVEL********
	String obterData() {
		return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
	}
	
	void imprimirDataFormatada1() {
		System.out.println(this.obterData());
	}	
	
}
