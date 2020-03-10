package es.avalon;

public class Principal13notasarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// generar un array con 5 notas, y subir los suspensos un punto
		
		int [] notas=new int [] {3, 4, 7, 2, 8};
		
		System.out.print(notas[0]+",");
		System.out.print(notas[1]+",");
		System.out.print(notas[2]+",");
		System.out.print(notas[3]+",");
		System.out.println(notas[4]);
		
		for(int i=0; i<notas.length; i++) {  // otro metodo para pintar el primer vector
			
			System.out.print(notas[i]+",");
		
		}
			System.out.println();
			
		for(int i=0; i<notas.length; i++) {
			
			if (notas[i]<5) {
				
				notas[i]=notas[i]+1;
			}
			
			System.out.print(notas[i]+",");
		}
		
	}

}
