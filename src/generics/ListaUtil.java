package generics;

import java.util.List;

public class ListaUtil {
	
	public static Object getUtil1(List<?> lista) {
		return lista.get(lista.size() - 1);// lista.size() - 1 ==> PEGA O ULTIMO ELEMENTO DA LISTA
	}
	public static <T> T getUtil2(List<T> lista) {// GENERICS DENTRO DO METODO
		return lista.get(lista.size() - 1);
	}
}
