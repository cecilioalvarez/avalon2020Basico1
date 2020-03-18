package Clase8Electrodomestico2;

import java.util.ArrayList;

public class Casa {

	ArrayList<String> lista=new ArrayList<String>();

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
		//void y no tenia return
	public void addElemento(String a) {
		
		 lista.add(a);
	}
	
}
