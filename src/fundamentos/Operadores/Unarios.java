package fundamentos.Operadores;

public class Unarios {
   public static void main(String[] args) {

	   int a = 1; //int a = 1;(a++) a = 2; acresenta 1;
	   int b = 2;//int b = 2; (--b) b = 1; retira 1;
	   
	   a++;// INCREMENTA�AO ( RECEBE MAIS 1) FORMA POS FIXADA;
	   a--;// DECREMENTA�AO ( RETIRA 1 ) FORMA POS FIXADA;
	   
	   ++b;// INCREMENTA�AO ( RECEBE MAIS 1) FORMA PRE FIXADA;
	   --b;// DECREMENTA�AO ( RETIRA 1 ) FORMA PRE FIXADA;
	   
	   
	  System.out.println(a);
	  System.out.println(b);
	  
	  System.out.println("Mini Desafio...");
	  System.out.println(a++ == --b);//OBS: AQUI ELE PRIMEIRO INCREMENTA FAZ A COMPARA�AO E DEPOIS DECREMENTA;
	  System.out.println(a == b);
	  System.out.println(a);
	  System.out.println(b);
   //HB VC LEMBRE QUE A MAIOR VIRTUDE DE UM PROGRAMADOR � ESCREVER COD FACIL, COD DE FACIL COMPEEN�AO COM BONS,
  //NOMES NAS VARIAVEIS; � UM DESAFIO ESCREVER UM COD SIMPLES 09/11/2021 AS 19:59 O ALISSON TA SENTADO NA MINHA FRENTE ESTUDANDO; 
   
   
   
   
   
   
   
   
   
   
   
   }
}
