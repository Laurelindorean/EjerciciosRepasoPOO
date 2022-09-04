package EstructuraDatos;

public class Lavadora {
	private String marca;
	private int potencia;
	private String anioFabricacion;
	private int carga;
	
	public Lavadora(String marca, int potencia, String anioFabricacion, int carga) {
		this.marca = marca;
		this.potencia = potencia;
		this.anioFabricacion = anioFabricacion;
		this.carga= carga;
	}
	public Lavadora() {
	}
	public Lavadora(String marca) {
		this.marca = marca;
	}
}
