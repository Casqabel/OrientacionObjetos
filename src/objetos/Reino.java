package objetos;

public class Reino {
	String nombre;
	Propiedad[] propiedades;
	Noble rey;
	Persona[]	ejercito;
	
	
	public Reino(String nombre, Noble rey) {
		super();
		this.nombre = nombre;
		this.rey = rey;
	}
	
	
	public void Batalla(Reino enemigo) {
		int i=0;
		boolean victoria=false;
		while(i<ejercito.length && !victoria) {
			if(ejercito[i]!=null && enemigo.ejercito[i]==null) {
				victoria=true;
				
			}
			
		}
		if(victoria) 
		{ enemigo.rey=this.rey;}
		else {this.rey=enemigo.rey;}
		
		
	}
}
