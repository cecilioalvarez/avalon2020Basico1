package es.avalon.interfaces2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElementoCasa e1=new Ordenador(true);
		ElementoCasa e2=new Frigorifico(false);
		
		OnOff(false,e1);
		OnOff(false,e2);
			
	}
	
	public static void OnOff(boolean encendido, ElementoCasa elemento) {
		
		elemento.OnOff(encendido);
	}

}
