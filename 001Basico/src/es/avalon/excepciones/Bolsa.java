package es.avalon.excepciones;

import java.util.ArrayList;

public class Bolsa {
	
	private int tope;
	
	public int getTope() {
		return tope;
	}

	private ArrayList<String> items=new ArrayList<String>();

	public ArrayList<String> getItems() {
		return items;
	}

	public void setItems(ArrayList<String> items) {
		this.items = items;
	}

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}
	
	public void addItem(String item) {
		
		if(this.items.size()<tope)
			this.items.add(item);
		
		else throw new Exception ("no admito mas");
	}
}
