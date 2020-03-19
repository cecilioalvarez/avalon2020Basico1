package es.avalon.interfaces3;

import java.util.ArrayList;

public class Casa {

	private ArrayList<ElementoCasa> miselementos=new ArrayList<ElementoCasa>();

	
	public ArrayList<ElementoCasa> getMiselementos() {
		return miselementos;
	}


	public void setMiselementos(ArrayList<ElementoCasa> miselementos) {
		this.miselementos = miselementos;
	}


	public void addElementos(ElementoCasa e){
		
		this.miselementos.add(e);
	}
	
	public void encenderTodo() {
		
		for (ElementoCasa e:this.miselementos) {
			
			if (e.isEncendido()==false) {
				e.pulsar();
			}
		}
	}
}
