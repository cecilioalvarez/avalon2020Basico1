package es.avalon.clases4;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejemplar e1 = new Ejemplar("Harry Potter 1", 200);
		Ejemplar e2 = new Ejemplar("Harry Potter 2", 230);
		Ejemplar e3 = new Ejemplar("Harry Potter 3", 270);
		Ejemplar e4 = new Ejemplar("Harry Potter 4", 320);
		
		System.out.println(e1.getPeso());
		System.out.println(e2.getPeso());
		System.out.println(e3.getPeso());
		System.out.println(e4.getPeso());
		System.out.println(Ejemplar.getPesoTotal());

	}

}
