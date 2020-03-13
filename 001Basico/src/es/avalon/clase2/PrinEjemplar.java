package es.avalon.clase2;

public class PrinEjemplar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejemplar e1=new Ejemplar("1",2);
		Ejemplar e2=new Ejemplar("2",3);
		
		System.out.println(Ejemplar.getPesoTotal());
	}

}
