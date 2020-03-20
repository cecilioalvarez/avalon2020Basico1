package Clase10_Wrapper;

public class Principal {

	public static void main(String[] args) {
		int numero=5;
		//convierto mi tipo basico a un objeto
		Integer i=new Integer(5);
		//ahora el objeto  lo  voy a convertir a basicoç
		int numero2=i.intValue();
		
		
		//ahora lo que declaro es un String con un numero dentro
		String numero3="5";
		
		int numero4=Integer.parseInt(numero3);
		//como el parseInt esta en la clase Integer por eso lo llamo
		//ya que es la propiedad de pasar un numero a cadena
		

	}

}
