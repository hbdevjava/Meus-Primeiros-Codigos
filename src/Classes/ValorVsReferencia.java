package Classes;

public class ValorVsReferencia {
	public static void main(String[] args) {
//***********ATRIBUIÇAO POR VALOR ********************	 
		double a = 2;
		double b = a;
		a++;
		b--;
		System.out.println(a + " , " + b);
		
//*********** ATRIBUIÇAO POR REFERENCIA ***************	
		Data data = new Data(1, 6, 2022);
		Data datalisboa = data;
		
		data.dia = 31;
		datalisboa.mes = 12;
		 System.out.println(data.obterData());
		 System.out.println(datalisboa.obterData());
		 System.out.println();
		// VoltarDataPadrao(datalisboa);
		
		 //System.out.println(data.obterData());
		 //System.out.println(datalisboa.obterData());
	}
		
		
		//static void VoltarDataPadrao(Data d) {
			//d.dia = 1;
			//d.mes = 6;
			//d.ano = 1970;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

