package Classes;

public class DataTeste {
	
	public static void main(String[] args) {
		
		 Data data = new  Data();
		 //data.dia= 29;
		 //data.mes = 07;
		 //data.ano = 1986;
		 //System.out.println(data.obterData());
		 //System.out.printf("%d/%d/%d", data.dia,  data.mes, data.ano );
		
	     var datalisboa = new Data(31, 12, 2020);
	     //datalisboa.dia = 25;
		 //datalisboa.mes = 07;
	     //datalisboa.ano = 2024;
		 //System.out.println(datalisboa.obterData());
		String dataFormatada1 = data.obterData();
		 //System.out.printf("%d/%d/%d", datalisboa.dia,  datalisboa.mes, datalisboa.ano );
		System.out.println(dataFormatada1);
		System.out.println(datalisboa.obterData());
	      
		data.imprimirDataFormatada1();
		datalisboa.imprimirDataFormatada1();
		
		
		
		
	}

}