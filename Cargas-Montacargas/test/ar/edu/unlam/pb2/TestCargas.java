package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCargas {

	@Test 
	public void crearMontacarga() {
		Montacarga montacarga = new Montacarga (25.5);
		assertNotNull(montacarga);
	}
	
	@Test
	public void obtenerCarga() throws NoExisteCarga {
		Montacarga montacarga = new Montacarga(25.5);
		Carga carga = new Carga(1,15.5);
		Carga carga1 = new Carga(1,15.5);
		montacarga.cargar(carga);
		montacarga.cargar(carga1);
		assertEquals((Integer)2, (Integer)montacarga.getNuevaCarga().size());
	}
	
	@Test
	public void descargarCarga() throws NoExisteCarga {
		Montacarga montacarga = new Montacarga(25.5);
		Carga carga = new Carga(1, 15.5);
		montacarga.cargar(carga);
		montacarga.descargar(carga);
		assertEquals((Integer)1, (Integer)montacarga.getCargasCompletas().size());
	}
	
	@Test
	public void obtenerCargaPromedio() throws NoExisteCarga {
		Montacarga montacarga = new Montacarga(25.5);
		Carga carga = new Carga(1,15.5);
		Carga carga1 = new Carga(2,18.5);
		Carga carga2 = new Carga(3, 21.5);
		montacarga.cargar(carga);
		montacarga.cargar(carga1);
		montacarga.cargar(carga2);
		montacarga.descargar(carga);
		assertEquals((Double)18.5, (Double)montacarga.obtenerPromedio());
		
	}

}
