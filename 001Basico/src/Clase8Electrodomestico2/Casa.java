package Clase8Electrodomestico2;

import java.util.ArrayList;

public class Casa {

	private ArrayList<Electrodomesticos> lista=new ArrayList<Electrodomesticos>();

	
		public ArrayList<Electrodomesticos> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Electrodomesticos> lista) {
		this.lista = lista;
	}
	//void y no tenia return
	public void addElemento(Electrodomesticos a) {
		
		 lista.add(a);
	}
	public void quitarElemento(Electrodomesticos a) {
		
		this.lista.remove(a);
	}
	public void encenderTodo() {
		for(Electrodomesticos i:this.lista) {
			if(!i.isEncender()==false) {
				i.pulsar();
			}
		}
	}
}
