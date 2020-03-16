package es.avalon.clases6composicion3;

public class Principal1bombilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bombilla b1=new bombilla(true);
		
		System.out.println(b1.isOn());
		b1.apagar();
		System.out.println(b1.isOn());
		b1.encender();
		System.out.println(b1.isOn());
		
	}

}
