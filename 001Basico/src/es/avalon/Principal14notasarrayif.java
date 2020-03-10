package es.avalon;

public class Principal14notasarrayif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creo un array con 5 notas y sumo 1 a las menores de 5
		int[] notas= new int[] {7,2,5,3,9};
		
		for (int i=0;i<notas.length; i++) {

		System.out.print(notas[i]+",");
		}
		System.out.println(); //Pinto las 5 notas antes de sumar
		
		for (int i=0;i<notas.length; i++) {
			
		if (notas[i]<5) {
			notas[i]=notas[i]+1;
		}
		
		System.out.print(notas[i]+","); //Pinto las notas retocadas
	}
	}
}
