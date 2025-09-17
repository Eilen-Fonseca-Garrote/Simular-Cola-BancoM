package Paq2;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Queue;

public class Banco implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Queue<Cliente> cola;
	
	
	
	public Banco(){
		
		cola = new ArrayDeque<Cliente>();
	}
	
	public Queue<Cliente> getCola(){
		return cola;
	}
	
	
	
}
