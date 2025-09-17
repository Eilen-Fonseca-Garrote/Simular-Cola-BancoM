package Paq2;

import java.util.ArrayList;

import Interfaz.Select;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("1231", "Eilen");
		Cliente c2 = new Cliente("1232", "Roger");
		Cliente c3 = new Cliente("1233", "Mauro");
		Cliente c4 = new Cliente("1234", "Roberto");
		Cliente c5 = new Cliente("1235", "Marcelo");
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		clientes.add(c5);
		
		
		Select s = new Select(clientes);
		s.setVisible(true);
		
		
		
		
		
		
	}
	


}
