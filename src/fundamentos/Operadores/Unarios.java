package fundamentos.Operadores;

public class Unarios {
   public static void main(String[] args) {

	   int a = 1; //int a = 1;(a++) a = 2; acresenta 1;
	   int b = 2;//int b = 2; (--b) b = 1; retira 1;
	   
	   a++;// INCREMENTAÇAO ( RECEBE MAIS 1) FORMA POS FIXADA;
	   a--;// DECREMENTAÇAO ( RETIRA 1 ) FORMA POS FIXADA;
	   
	   ++b;// INCREMENTAÇAO ( RECEBE MAIS 1) FORMA PRE FIXADA;
	   --b;// DECREMENTAÇAO ( RETIRA 1 ) FORMA PRE FIXADA;
	   
	   
	  System.out.println(a);
	  System.out.println(b);
	  
	  System.out.println("Mini Desafio...");
	  System.out.println(a++ == --b);//OBS: AQUI ELE PRIMEIRO INCREMENTA FAZ A COMPARAÇAO E DEPOIS DECREMENTA;
	  System.out.println(a == b);
	  System.out.println(a);
	  System.out.println(b);
   //HB VC LEMBRE QUE A MAIOR VIRTUDE DE UM PROGRAMADOR É ESCREVER COD FACIL, COD DE FACIL COMPEENÇAO COM BONS,
  //NOMES NAS VARIAVEIS; É UM DESAFIO ESCREVER UM COD SIMPLES 09/11/2021 AS 19:59 O ALISSON TA SENTADO NA MINHA FRENTE ESTUDANDO; 
   
   
   
   
   
   
   
   
   
   
   
   }
}
