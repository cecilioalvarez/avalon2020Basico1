package es.clases3;

import java.util.ArrayList;

public class Principal3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista= new ArrayList<Integer>();
		lista.add(0);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(10);
		lista.add(8);
		for (int i=0; i<lista.size();i++) {
			if(lista.get(i)>=5) {
			System.out.println(lista.get(i));
		}else {
			i++;
		}
	}
		
	}

}
