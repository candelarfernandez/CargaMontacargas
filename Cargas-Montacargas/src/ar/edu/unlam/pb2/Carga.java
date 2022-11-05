package ar.edu.unlam.pb2;

public class Carga {
	private Double peso;
	private Integer id;

	public Carga(Integer id, Double peso) {
		this.id=id;
		this.peso=peso;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	

}
