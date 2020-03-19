package es.clases6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impresora i1= new ImpresoraTinta(); 
		Impresora i2= new ImpresoraLaser(); 
		Impresora i3= new GuardarPDF(); 
		
		WordDoc word= new WordDoc(i1);
		word.ImprimirDocumento("hola guapo");
		word.ImprimirDocumento("hola cielo");
		word.ImprimirDocumento("hola tesoro");
		 // forma de ceci
		
		WordDoc documento = new WordDoc( new ImpresoraLaser());
		documento.ImprimirDocumento("hola");
		documento.setImpresora(new ImpresoraTinta());
		documento.ImprimirDocumento("Cari");
		
		
	}

}
