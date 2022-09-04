package EstructuraDatos;

import java.util.Random;

public class Persona {

	private static final char SEXO_DEF = 'H';
	private static final int INFRA_PESO = -1;
	private static final int PESO_IDEAL = 0;
	private static final int SOBRE_PESO = 1;
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	public Persona() {

	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this(nombre, edad, null, sexo, peso, altura);
		this.dni = this.generarDNI();
	}

	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	

	public int calcularIMC() {
		double pesoActual = peso / (Math.pow(altura, 2));
		if (pesoActual < 20) {
			System.out.println("Tu peso está por debajo de lo ideal");
			return INFRA_PESO;
		} else if (pesoActual >= 20 && pesoActual <= 25) {
			System.out.println("Tienes el peso ideal");
			return PESO_IDEAL;
		}
		System.out.println("Tienes sobrepeso");
		return SOBRE_PESO;
	}

	public boolean esMayorDeEdad() {
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
			return true;
		}
		System.out.println("Es menor de edad");
		return false;
	}

	private String generarDNI() {
		int numDni = this.generarNumRandom();
		int divisor = 23;
		int resto = numDni - (numDni / 23 * 23);
		char letraDni = this.generarLetra(resto);
		return Integer.toString(numDni) + letraDni;
	}

	private int generarNumRandom() {
		int numDni;
		Random r = new Random();
		numDni = r.nextInt(10000000, 99999999);
		return numDni;
	}

	private char generarLetra(int resto) {
		
		char[] letrasDni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		return letrasDni[resto];
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura
				+ "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
