package POO1;

public class Lavadora {
	private String marca;
	private int potencia;
	private String añoFabricacion;
	private int carga;
	
	public Lavadora(String marca, int potencia, String añoFabricacion, int carga) {
		this.marca = marca;
		this.potencia = potencia;
		this.añoFabricacion = añoFabricacion;
		this.carga= carga;
	}
	public Lavadora() {
	}
	public Lavadora(String marca) {
		this.marca = marca;
	}
}
