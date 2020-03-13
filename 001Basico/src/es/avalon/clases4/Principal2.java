package es.avalon.clases4;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factura f = new Factura(1, 100);
		System.out.println(f.getNumero());
		System.out.println(f.getImporte());
		//Para un objeto
		System.out.println(f.calcularIVA());
		//Estatica sin objeto
		System.out.println(Factura.calcularIVA(100));
	}
}
