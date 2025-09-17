package Paq2;

import java.io.Serializable;

public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String nombre;
	
	
	public Cliente(String id, String nombre){

		this.id = id;
		this.nombre = nombre;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + 
				"]";
	}
	
	public void setId(String id){
		if(id.length() == 11){
			this.id = id;
		}
		else
			throw new IllegalArgumentException("Error en la cantidad de cifras del id");
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	
	
	
}
