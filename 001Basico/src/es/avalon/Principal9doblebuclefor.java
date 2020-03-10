package es.avalon;

public class Principal9doblebuclefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Piramide acumulando numeros
		
		String num="";
		for(int i=0;i<10;i++) {
			
			num=num+i;
			System.out.println(num);
			
		}
		
		//Repetimos el ejercicio para un bucle for dentro de otro bucle for
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(j); //print() pinta todo en la misma linea
			}
			System.out.println(); //println() pinta en lineas sucesivas
		}
	}

}
