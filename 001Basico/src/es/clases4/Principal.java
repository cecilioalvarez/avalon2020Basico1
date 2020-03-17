package es.clases4;

public class Principal {
 public static void main (String []args) {
	 Telefono t1= new Telefono(123456789, "Samsung");
	 System.out.println(t1.getNumero() +"  "+t1.getMarca());
	 
	 t1.llamar (945826731);
	 
	 Smartphone t2= new Smartphone(555555, "Apple");
	 System.out.println(t2.getNumero() +"  "+t2.getMarca());
	 t2.llamar(7869543);
 }
}
