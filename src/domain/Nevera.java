package domain;

public class Nevera {

	private long serial;
	private String marca;
	private int precio;
	private int capacidad;
	private Boolean esNueva;

	public Nevera(long serial, String marca, int precio, int capacidad, Boolean esNueva) {
		super();
		this.serial = serial;
		this.marca = marca;
		this.precio = precio;
		this.capacidad = capacidad;
		this.esNueva = esNueva;
	}

	public long getSerial() {
		return serial;
	}

	public void setSerial(long serial) {
		this.serial = serial;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Boolean getEsNueva() {

		return esNueva;
	}

	public void setEsNueva(Boolean esNueva) {

		this.esNueva = esNueva;
	}

}
