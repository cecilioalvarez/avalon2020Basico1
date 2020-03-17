package es.avalon.clases8Polimorfismo;

public class Principal {

	public static void main(String[] args) {


		Persona p=new Persona("Gema",30);
		//Le apuntamos con un puntero de persona
		Persona d=new Deportista("Pedro",40,"Padel");
		
		p.andar();
		d.andar();
		
		Deportista d1=(Deportista)d;
		System.out.println(d1.getDeporte());

	}

}
