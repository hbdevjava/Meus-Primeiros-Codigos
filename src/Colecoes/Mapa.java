package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Mapa {
	public static void main(String[] args) {
		// sempre usar os WRAPPER dos Primitivos
		Map<Integer, String> usuarios = new HashMap<>();
		//MAPA NAO USA O METODO .ADD 
		usuarios.put(1,"hb");
		usuarios.put(2,"rr");
		usuarios.put(3,"tt");
		usuarios.put(4,"uu");
		usuarios.put(5,"kk");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("uu"));
		System.out.println(usuarios.containsValue("bb"));
		
		System.out.println(usuarios.get(4));
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		
		for (String  valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for (Entry <Integer, String> reg : usuarios.entrySet()) {
			System.out.print(reg.getKey() + " ==> ");
			System.out.println(reg.getValue());
		}
		
		
		
	}
}
