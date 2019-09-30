package domain;

import java.util.*;

public class Tienda {

	private String nombre;
	ArrayList<Nevera> neveras = new ArrayList<Nevera>();
	public final int  CAPACIDAD_TOTAL = 3;

	public Tienda(String nombre) {
		this.nombre = nombre;
	}

	public boolean agregar(Nevera neveraParaAgregar) {
		
		int espacioEnTienda=CAPACIDAD_TOTAL;

		for (int i = 0; i < neveras.size(); i++) {
			if (neveras.get(i).getSerial() == neveraParaAgregar.getSerial()) {
				System.out.println("ya existe el serial " + neveraParaAgregar.getSerial() + " No se agregó la Nevera "
						+ neveraParaAgregar.getMarca());
				if (espacioEnTienda == 0) {
					System.out.println(" y no se agregó porque la capacidad es de " + espacioEnTienda);
				}
				return false;
			}
		}
		espacioEnTienda--;
		neveras.add(neveraParaAgregar);
		System.out.println("se agrego la nevera correctamente!");
		return true;
	}

	public Nevera buscar(long serial) {

		Nevera neveraPrueba = null;

		for (int i = 0; i < neveras.size(); i++) {

			if (neveras.get(i).getSerial() == serial) {

				neveraPrueba = neveras.get(i);

				System.out.println("Serial: " + neveraPrueba.getSerial() + " Marca: " + neveraPrueba.getMarca()
						+ " Precio: " + neveraPrueba.getPrecio() + " capacidad: " + neveraPrueba.getCapacidad()
						+ " es nueva? " + neveraPrueba.getEsNueva());
			}

		}
		if (neveraPrueba == null) {
			System.out.println("No existe nevera con ese serial:" + serial);
		}
		return null;
	}

	public List<Nevera> buscar(String marca) {
		List<Nevera> neverasDeLaMarca = new ArrayList<Nevera>();

		for (int i = 0; i < neveras.size(); i++) {

			if (neveras.get(i).getMarca().equalsIgnoreCase(marca)) {

				neverasDeLaMarca.add(neveras.get(i));

				System.out.println("Serial: " + neverasDeLaMarca.get(i).getSerial() + " Marca: "
						+ neverasDeLaMarca.get(i).getMarca() + " Precio: " + neverasDeLaMarca.get(i).getPrecio()
						+ " capacidad: " + neverasDeLaMarca.get(i).getCapacidad() + " es nueva? "
						+ neverasDeLaMarca.get(i).getEsNueva());
			}
			// como hacer para comparar marca en todo el array y no campo por campo y decir
			// que esa marca no
			// existe

		}
		for (int j = 0; j < neveras.size(); j++) {
			if (neveras.get(j).getMarca().contains(marca) == false) {

				System.out.println("no existe Nevera de la marca " + marca);

			}

		}

		return null;
	}

	public List<Nevera> buscar(boolean soloNuevas) {
		List<Nevera> neverasNuevas = new ArrayList<Nevera>();

		for (int i = 0; i < neveras.size(); i++) {
			if (neveras.get(i).getEsNueva() == true) {
				neverasNuevas.add(neveras.get(i));

				System.out.println("Serial: " + neverasNuevas.get(i).getSerial() + " Marca: "
						+ neverasNuevas.get(i).getMarca() + " Precio: " + neverasNuevas.get(i).getPrecio()
						+ " capacidad: " + neverasNuevas.get(i).getCapacidad() + " es nueva? "
						+ neverasNuevas.get(i).getEsNueva());
			}

		}
		if (soloNuevas == false) {
			System.out.println("Se buscan solo neveras nuevas ");
		}

		return null;
	}

	public List<Nevera> buscarConMasCapacidadDe(int capacidad) {
		List<Nevera> neveracapacidad = new ArrayList<Nevera>();

		for (int i = 0; i < neveras.size(); i++) {
			if (neveras.get(i).getCapacidad() >= capacidad) {
				neveracapacidad.add(neveras.get(i));
				// por que me sale fuera de index cuando imprimo neveracapacidad si ya tiene una
				// nevera in
				System.out.println(neveras.get(i).getSerial());
			}
		}

		return null;
	}

	public void vender(Nevera nevera) {
		for (int i = 0; i < neveras.size(); i++) {

			if ((Nevera) neveras.get(i) == nevera) {
				neveras.remove(i);
				System.out.println("Se vendió la nevera: " + neveras.get(i).getSerial());
			}
		}
		// como hacer para eliminar para comparar una sola vez
		for (int i = 0; i < neveras.size(); i++) {
			if ((Nevera) neveras.get(i) != nevera) {

				System.out.println("no existe tal nevera");
			}
		}
	}
//como hacer para que retorne el int y no solo el syso
	public int capacidadActual() {
		int cap = CAPACIDAD_TOTAL-neveras.size();
				System.out.println("la capacidad actual es de " + cap);
		return cap;
	}

}
