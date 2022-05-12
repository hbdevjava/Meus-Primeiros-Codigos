package Colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<ListUsuario> lista = new ArrayList<>();
		//ListUsuario usuario = new ListUsuario ("Brito");
		//lista.add(usuario);
		
		lista.add(new ListUsuario("hb"));
		lista.add(new ListUsuario("son"));
		lista.add(new ListUsuario("dora"));
		lista.add(new ListUsuario("xxxx"));
		
		System.out.println(lista.get(1));
			
		
		System.out.println(lista.remove(3));
		System.out.println(lista.remove(new ListUsuario ("dora")));
		
		for (ListUsuario u: lista) {
			System.out.println(u.toString());
		}	
		
		
		
		
		
		
	}
}
