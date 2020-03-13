package es.avalon.clase2;
import es.avalon.clase1.Tableta;
public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tableta t=new Tableta("apple",100);
		System.out.println(t.getMarca());
		System.out.println(t.getPrecio());
		System.out.println(t.getPrecioConIVA());
		System.out.println(t.getPrecioConIVA(10));
		
		Tableta t2=new Tableta(500);
		System.out.println(t2.getMarca());
	}
}
