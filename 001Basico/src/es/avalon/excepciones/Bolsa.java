package es.avalon.excepciones;

import java.util.ArrayList;

public class Bolsa {

	private int tope;

	public int getTope() {
		return tope;
	}

	private ArrayList<String> items = new ArrayList<>();

	public ArrayList<String> getItems() {
		return items;
	}

	public void setItems(ArrayList<String> items) {
		this.items = items;
	}

	public Bolsa(ArrayList<String> items) {
		super();
		this.items = items;
	}
	
	public void addItem(String item)

}
