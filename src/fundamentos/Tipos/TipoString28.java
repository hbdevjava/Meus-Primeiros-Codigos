package fundamentos.Tipos;



public class TipoString28 {
  public static void main(String[] args) {
	
	  System.out.println("Ola Pessoas" .charAt(5));
	  //MOSTRA QUAL A POSIÇAO DE CADA LETRA DENTRO DA STRING;
	  //STRING NAO É TIPO PRIMITIVO;
	  
	  String s = "Boa Tarde!";
	  System.out.println(s.concat("!!!"));
	  System.out.println(s + "!!!");
	  System.out.println(s.startsWith("Boa"));
	  System.out.println(s.toLowerCase().startsWith("hb"));
	  System.out.println(s.endsWith("tarde"));
	  System.out.println(s.length());
	  System.out.println(s.toLowerCase().equals("BOA TARDE"));
	  System.out.println(s.equalsIgnoreCase("boa tarde"));//DESCONSIDERA LETRAS MAIUSCULA E MINUSCULAS;
	  
	  
	 var nome = "hb";
	 var sobrenome = "brito";
	 var idade = 33;
	 var salario = 12345.98;
	 
	 System.out.println("nome: " + nome + "\nsobrenome: " + sobrenome + "\nsalario: " + salario + "\nidade: " + idade);
//EDIÇAO1: PRA DA ESPAÇOS ENTRE OS NOMES BASTA DA ESPAÇOS DENTRO DOS PARENTESES EX: System.out.println(" nome: " + nome);
//EDIÇAO2: PRA DA QUEBRA DE LINHA COLOCA \N DENTRO DA STRING EX:System.out.println(" nome: " + nome + "\nsobrenome: " + sobrenome); 	  
	
	 //EDIÇAO MAIS ADEQUADA USANDO 0 % (DOLLAR) %S %D %F
	 System.out.printf("O Senhor %s %s tem %d anos de idade e ganha R$:%.2f.", nome , sobrenome, idade, salario);
	  //OBS: %.2f. ESSE .2 DIZ QUANTOAS CASAS DECIMAIS QUERO IMPRIMIR;
	 
	 String frase = String.format("\nO Senhor %s %s tem %d anos de idade e ganha R$:%.2f.", nome , sobrenome, idade, salario);
	 System.out.println(frase);
	 
	 System.out.println("Frase qualquer" .substring(4));
	 System.out.println("hebert brito" .substring(2,8));
	 
	  
  }
}
