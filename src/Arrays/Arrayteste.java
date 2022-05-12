package Arrays;

import java.util.Arrays;

public class Arrayteste {
    public static void main(String[] args) { 
    	//ARRAY É ESTATICO E TEM UM TAMANHO FIXO;
    	//HOMOGEINO TODOS OS DADOS TEM QUE SER FO MESMO TIPO;
    	//INDEXADO VC SEMPRE ACESSA A PARTIR DUMA POSIÇAO ENUMERADA (COMEÇA DE 0, 1, 2... O TAMANHO MENOS 1);
    	//ARREY É UM OBJETO OU SEJA VC TEM ATRIBUTOS E COMPORTAMENSTOS ASSOCIADO A ELE;
         double[] notasAlunoA = new double [9];
         System.out.println(Arrays.toString(notasAlunoA)); 
         
         notasAlunoA[0] = 7.8;
         notasAlunoA[1] = 8;
         notasAlunoA[2] = 6.7;
         notasAlunoA[3] = 5.7;
         notasAlunoA[4] = 7.2;
         notasAlunoA[5] = 2.3;
         notasAlunoA[6] = 9.7;
         notasAlunoA[7] = 8.7;
         notasAlunoA[8] = 9.9;
         
         System.out.println(notasAlunoA[3]);
         double totalAlunoA = 0;
         for ( int i = 0; i < notasAlunoA.length; i++ ) {
        	 totalAlunoA += notasAlunoA[i];
         }
     
  System.out.println(totalAlunoA/ notasAlunoA.length);
     
     double [] notasAlunoB = {8.7, 9.9, 7.6, 10};
     double totalAlunoB = 0;
     for ( int i = 0; i < notasAlunoB.length; i++ ) { //-> EXPRESSAO TERNARIA;
    	 totalAlunoB += notasAlunoB[i];
     }
 
 System.out.println(totalAlunoB/ notasAlunoB.length);
 
     
     
   
     
     
     
     
     
     
     
     
     
   }
		
}

