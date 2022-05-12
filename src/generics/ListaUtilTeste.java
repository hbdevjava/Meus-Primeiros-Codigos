package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("SJ", "php", "java", "c");
		List<Integer> Numbs = Arrays.asList(1, 2, 3, 4);
		
		String ultimaLinguagem =(String) ListaUtil.getUtil1(langs);
		System.out.println(ultimaLinguagem);
		Integer ultimoNumaro =(Integer) ListaUtil.getUtil1(Numbs);
		System.out.println(ultimoNumaro
				);
	}
}
