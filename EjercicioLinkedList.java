package POO1;

import java.util.*;

public class EjercicioLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> miLista = new LinkedList();
		miLista.add(2);
		miLista.add(4);
		miLista.add(3);
		miLista.add(10);
		miLista.add(11);
		miLista.add(7);
		miLista.add(12);
		miLista.add(21);
		miLista.add(9);
		miLista.add(97);
		System.out.println("Mi LinkedList original es:");
		imprimirLista(miLista);
		System.out.println("\nMi LinkedList ordenado es:");
		ordenar(miLista);
		imprimirLista(miLista);
		System.out.println("\nMi LinkedList de números primos:");
		imprimirLista(listaPrimos(miLista));
		System.out.println("\nMi LinkedList de números pares:");
		imprimirLista(listaPares(miLista));
	}

	public static void imprimirLista(LinkedList<Integer> miLista) {
		LinkedList lista = miLista;
		StringJoiner separador = new StringJoiner(" , ");
		for (int i = 0; i < lista.size(); i++) {
			separador.add(lista.get(i).toString());
		}
		System.out.println(separador.toString());
	}

	public static LinkedList<Integer> ordenar(LinkedList<Integer> miLista) {
		Collections.sort(miLista);
		return miLista;

	}

	public static boolean esPrimo(int numero) {
		boolean primo = (numero == 1) ? false : true;
		int divisor = 2;
		while (primo && divisor <= Math.sqrt(numero)) {
			if (numero % divisor == 0) {
				primo = false;
			}
			divisor++;
		}
		return primo;
	}

	public static LinkedList<Integer> listaPrimos(LinkedList<Integer> miLista) {
		LinkedList<Integer> lista = new LinkedList();
		for (int i = 0; i < miLista.size(); i++) {
			if (esPrimo((int) miLista.get(i))) {
				lista.add(miLista.get(i));
			}
		}
		return lista;
	}

	public static LinkedList<Integer> listaPares(LinkedList<Integer> miLista) {
		LinkedList<Integer> lista = new LinkedList();
		for (int i = 0; i < miLista.size(); i++) {
			if (miLista.get(i) % 2 == 0) {
				lista.add(miLista.get(i));
			}
		}

		return lista;
	}

}