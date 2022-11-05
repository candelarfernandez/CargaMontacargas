package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Montacarga {
	private Double pesoMaximo;
	private Set<Carga> nuevaCarga;
	private Set<Carga> cargasCompletas;

	public Montacarga(Double pesoMaximo) {
		// TODO Auto-generated constructor stub
		this.pesoMaximo=pesoMaximo;
		this.cargasCompletas= new HashSet<>();
		this.nuevaCarga= new HashSet<>();
	}
	

	public Set<Carga> getNuevaCarga() {
		return nuevaCarga;
	}


	public void setNuevaCarga(Set<Carga> nuevaCarga) {
		this.nuevaCarga = nuevaCarga;
	}


	public Double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Set<Carga> getCargasCompletas() {
		return cargasCompletas;
	}

	public void setCargasCompletas(Set<Carga> cargasCompletas) {
		this.cargasCompletas = cargasCompletas;
	}

	public void cargar(Carga carga) throws NoExisteCarga {
		if(this.pesoMaximo<carga.getPeso()) {
			throw new NoExisteCarga();
		}
		else {
			this.nuevaCarga.add(carga);
		}
		
	}

	public void descargar(Carga carga) {
		this.cargasCompletas.add(carga);
	}

	public Double obtenerPromedio() {
		Double promedio=0.0;
		for (Carga carga : nuevaCarga) {
			promedio+= (carga.getPeso()/this.nuevaCarga.size());
		}
		return promedio;
	}
	

}
