package POO1;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioCompararStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorPalabra;
		valorPalabra = comparaString("anaLi", "anal");
		if (valorPalabra < 0) {
			System.out.println("La primera palabra va antes que la segunda");
		} else if (valorPalabra > 0) {
			System.out.println("La segunda palabra va antes que la primera");
		} else if(valorPalabra == 0) {
			System.out.println("Las palabras son iguales");
		}

	}

	public static int comparaString(String palabra1, String palabra2) {
	
		int valor = 1;
		if (palabra1.length() < palabra2.length()) {
			for (int i = 0; i < palabra1.length(); i++) {
				if ( palabra1.charAt(i) ==  palabra2.charAt(i)) {
					valor = -1;
			
				} else {
					char letra1 = palabra1.charAt(i);
					char letra2 = palabra2.charAt(i);
					valor = (int) letra1 - (int) letra2;
					break;
				}
			}
		} else if (palabra1.length() > palabra2.length()) {
			for (int i = 0; i < palabra2.length(); i++) {
				if ( palabra1.charAt(i) == palabra2.charAt(i)) {
					valor = 1;

				} else {
					char letra1 = palabra1.charAt(i);
					char letra2 = palabra2.charAt(i);
					valor = (int) letra1 - (int) letra2;
					break;
				}
			}
		} else if (palabra1.length() == palabra2.length()) {
			for (int i = 0; i < palabra1.length(); i++) {
				if ( palabra1.charAt(i) ==  palabra2.charAt(i)) {
					valor = 0;
					
				} else {
					char letra1 = palabra1.charAt(i);
					char letra2 = palabra2.charAt(i);
					valor = (int) letra1 - (int) letra2;
					break;

				}
			}
		}
		if (valor < 0) {
			return -1;
		} else if (valor > 0) {
			return 1;
		} else {
			return 0;
		}

	}

}