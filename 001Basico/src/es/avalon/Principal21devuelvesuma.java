package es.avalon;

public class Principal21devuelvesuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// funcion que me recorra el array y devuelva la suma de todos los valores mayores que tres
		
		int [] miarray=new int [] {5,6,2,1,8};
					
		int resultado=devuelvesumaM3(miarray);
		System.out.println(resultado);
}

	private static int devuelvesumaM3(int [] array) {
		int suma=0;
		for(int i=0; i<array.length; i++) {
			
			if (array[i]>3) {
				
				suma=suma+array[i];
			}
		}
		
		return suma;
	}
}
		
