package es.avalon.clases9polimorfismo2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factura f1=new FacturaConIVA(236,"telefono",350);
		Factura f11=new FacturaReducida(2361,"telefono",350);
		Factura f12=new FacturaSinIVA(2362,"telefono",350);
//		Factura f2=new FacturaConIVA(238,"television",250);
//		Factura f3=new FacturaConIVA(240,"cascos",19);
//		Factura f4=new FacturaConIVA(242,"carcasa",10);
		
		ArrayList <Factura> lista=new ArrayList<Factura>();
		
		lista.add(f1);
		lista.add(f11);
		lista.add(f12);
//		lista.add(f2);
//		lista.add(f3);
//		lista.add(f4);
		
		recorrerlista(lista);
		
		
	}

	private static void recorrerlista(ArrayList<Factura> lista) {
		for (Factura f:lista) {
			System.out.println(f.getNumero());
			System.out.println(f.getConcepto());
			System.out.println(f.getImporte());
			System.out.println(f.importeIVA());
			System.out.println("****************");
		}
	}

}
