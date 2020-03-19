package es.clases6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impresora i1= new ImpresoraTinta(); 
		Impresora i2= new ImpresoraLaser(); 
		Impresora i3= new GuardarPDF(); 
		
		WordDoc word= new WordDoc(i1);
		word.ImprimirDocumento("hola guapo", i1);
		word.ImprimirDocumento("hola cielo", i2);
		word.ImprimirDocumento("hola tesoro", i3);
		 // forma de ceci
		
		WordDoc documento = new WordDoc( new ImpresoraLaser());
		documento.ImprimirDocumento("hola", ImpresoraLaser());
		documento.setImpresora(new ImpresoraTinta());
		documento.ImprimirDocumento("Cari", ImpresoraTinta());
		
		
	}

}
