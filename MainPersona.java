package POO1;

import javax.swing.JOptionPane;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		String texto = JOptionPane.showInputDialog("Introduce tu edad");
		int edad = Integer.parseInt(texto);
		texto = JOptionPane
				.showInputDialog("Introduce el sexo, por favor solo introduce la letra H para hombre, M para mujer");
		char sexo = texto.charAt(0);
		texto = JOptionPane.showInputDialog("Introduce tu peso");
		double peso = Double.parseDouble(texto);
		texto = JOptionPane.showInputDialog("Introduce tu altura");
		double altura = Double.parseDouble(texto);
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Maria", 23, 'M', 65, 1.70);
		Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
		System.out.println(persona2.toString());
		persona1.setPeso(70);
		persona1.setAltura(1.75);
		persona1.setEdad(18);
		persona1.calcularIMC();
		persona1.esMayorDeEdad();
		System.out.println(persona3.toString());

	}

}
