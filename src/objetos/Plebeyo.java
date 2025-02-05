package objetos;

public class Plebeyo extends Persona{
String[] propiedades;
	
	
	public Plebeyo(String nombre) {
		super(nombre);
		this.salud=6;
		// TODO Auto-generated constructor stub
	}

	

public void presentarse() {
		
		System.out.println("Hey soy "+ this.nombre);
		
	}

}
