package es.avalon;

public class Principal5sumabucle {

	public static void main(String[] args) {
		
		//Suma de los 10 primeros numeros pares
		//Primero declaro la variable vacia
		int sumarTodos=0;
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			
			sumarTodos=sumarTodos+i; //Sumo cada uno de los terminos del bucle 
			
			System.out.println(sumarTodos);	//Pinto cada valor del bucle y a continuacion su valor acumulado		
		}

	}

}
