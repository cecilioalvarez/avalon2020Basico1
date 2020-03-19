package es.avalon.dClases11Excepciones;

import java.util.ArrayList;

public class Bolsa {

	private ArrayList<String> items = new ArrayList<String>();
	private int tope;

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}

	public int getTope() {
		return tope;
	}

	public ArrayList<String> getItems() {
		return items;
	}

	public void setItems(ArrayList<String> items) {
		this.items = items;
	}

	public void addItem(String item) throws Exception {
		if (this.items.size() < tope)
			this.items.add(item);
		else
			throw new Exception("No admito mas");
	}

}
