package es.avalon.clases2;

public class Telefono {

		private	int numero;
   	
		public int getNumero() {
			return numero;
			
		}
		public void setNumero(int numero) {
			if(numero>7000000) {
				this.numero=0;
			}else {
				this.numero=numero;
			}
			
		}
	}


