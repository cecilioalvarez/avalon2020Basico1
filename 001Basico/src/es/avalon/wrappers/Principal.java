package es.avalon.wrappers;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=5;
		// genero un objeto Integer a partir de un tipo basico
		Integer i=new Integer(5);
		// genero un tipo basico a partir de objeto integer
		int numero2=i.intValue();
		// delcaro una cadena con un numero dentro
		String numero3="5";
		// convierto la cadena en un tipo basico int
		int numero4=Integer.parseInt(numero3);
		// imprimo
		System.out.println(numero4);
	}

}
