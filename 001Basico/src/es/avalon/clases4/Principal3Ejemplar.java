package es.avalon.clases4;

public class Principal3Ejemplar {

	public static void main(String[] args) {

		//Defino ejemplar 1
		Ejemplar e1=new Ejemplar(1,250);
		System.out.println("Nº Ejemplar: "+e1.getNumero());
		System.out.println("Peso Ejemplar 1: "+e1.getPeso());
		//Defino ejemplar 2
		Ejemplar e2=new Ejemplar(2,1200);
		System.out.println("Nº Ejemplar: "+e2.getNumero());
		System.out.println("Peso Ejemplar 2: "+e2.getPeso());
		//Defino ejemplar 3
		Ejemplar e3=new Ejemplar(3,4000);
		System.out.println("Nº Ejemplar: "+e3.getNumero());
		System.out.println("Peso Ejemplar 3: "+e3.getPeso());
		
		//Saco el peso total
		System.out.println("Peso total: "+Ejemplar.getPesototal());
		

	}

}
