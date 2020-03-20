package clase9IgualdadFactura;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		Factura f1=new Factura(1,15,"cena");
		Factura f2=new Factura(2,15,"comida");
		Factura f3=new Factura(1,15,"cena");
		
		
		ArrayList<Factura> lista= new ArrayList<>();
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		
		System.out.println(lista.contains(new Factura(1)));
		System.out.println(contarFacturas(lista,f3));

	}
public static int contarFacturas(ArrayList<Factura> listaFacturas, Factura facturaBuscar) {
	int contador=0;
	
	for (Factura unaFactura:listaFacturas) {
		if(unaFactura.equals(facturaBuscar)) {
			contador++;
		}
	}return contador;
}
}
