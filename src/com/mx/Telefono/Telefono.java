package com.mx.Telefono;

public class Telefono {
	// Declarar atributos del objeto Telefono
	private String marca;
	private String modelo;
	private int precio;
	private int memoria;
	private int ram;

	// Metodo especial. Constructor: inicializar nuestro objeto
	public Telefono() {

	}

	// Constructor parametrizado: inicializar el objeto con valores especificos
	public Telefono(String marca, String modelo, int precio, int memoria, int ram) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.memoria = memoria;
		this.ram = ram;
	}

	// Metodos get y set
	// get: valida datos de los atributos
	// set: fija el valor del atributo

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;

	}

	public int getMemoria() {
		return memoria;

	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getRam() {
		return memoria;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	// Metodo toString delcaracion en la funciones, sirve para cualquier objeto
	// se utiliza para representar un objeto en cadena. Los convierte en legibles
	public String toString() {
		return "Telefono[ " + " marca= " + marca + " modelo= " + modelo + " precio= " + precio + " memoria= " + memoria + " ram= "
				+ ram + " ]\n";
	}
}
