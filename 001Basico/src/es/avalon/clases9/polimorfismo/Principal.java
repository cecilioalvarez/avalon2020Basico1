package es.avalon.clases9.polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("gema", 30);
		Deportista d = new Deportista("pedro", 40);
		
		Persona pd = new Deportista("ana", 35);
		
		d.setDeporte("futbol");
		// pd no tiene el método get/setDeporte()
		// pero si toma el metodo andar 
				
		p.andar();
		d.andar();
		pd.andar();
		
		//Casting para acceder a la propiedad deporte
		Deportista d2 = (Deportista)pd;
		System.out.println(d2.getDeporte());

	}

}
