package EstructuraDatos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringJoiner;

public class EjercicioArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> miArray = new ArrayList();
		

		miArray.add(2);
		miArray.add(4);
		miArray.add(3);
		miArray.add(10);
		miArray.add(11);
		miArray.add(7);
		miArray.add(12);
		miArray.add(21);
		miArray.add(9);
		miArray.add(97);
		System.out.println("Mi ArrayList original");
		imprimirArray(miArray);
		arrayOrdenado(miArray);
		System.out.println("\nMi ArrayList ordenada");
		imprimirArray(miArray);
		System.out.println("\nMi ArrayList de números primos");
		imprimirArray(arrayPrimos(miArray));
		System.out.println("\nMi ArrayList de núnmeros pares");
		imprimirArray(arrayPares(miArray));

	}

	public static void imprimirArray(ArrayList<Integer> miArray) {
		ArrayList<Integer> array = miArray;
		StringJoiner separador = new StringJoiner(" , ");
		for (int i = 0; i < array.size(); i++) {
			separador.add(array.get(i).toString());
		}

		System.out.println(separador.toString());
	}

	public static ArrayList<Integer> arrayOrdenado(ArrayList<Integer> miArray) {
		Collections.sort(miArray);
		return miArray;
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

	public static ArrayList<Integer> arrayPrimos(ArrayList<Integer> miArray) {

		ArrayList<Integer> nuevoArray = new ArrayList<>();
		for (int i = 0; i < miArray.size(); i++) {
			if (esPrimo((int) miArray.get(i))) {
				nuevoArray.add(miArray.get(i));
			}
		}
		return nuevoArray;
	}
	
	public static ArrayList<Integer> arrayPares(ArrayList<Integer> miArray){
		
		ArrayList<Integer> nuevoArray = new ArrayList<>();
		for (int i=0; i < miArray.size(); i++) {
			if(miArray.get(i)%2 == 0) {
				nuevoArray.add(miArray.get(i));
			}
		}
		return nuevoArray;
	}
}
