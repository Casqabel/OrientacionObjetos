package objetos;

public class Propiedad {
	String nombre;
	int valor;
	String descripcion;
	Noble duenyo;
	
	
	public Propiedad(String nombre, int valor) {
		this.nombre=nombre;
		this.valor=valor;
			
	}
	
	public Propiedad(String nombre, int valor, String descripcion) {
		this.nombre=nombre;
		this.valor=valor;
		this.descripcion=descripcion;
			
	}
	
	public Propiedad(String nombre, int valor, String descripcion, Noble duenyo) {
		this.nombre=nombre;
		this.valor=valor;
		this.descripcion=descripcion;
		this.duenyo=duenyo;
			
	}
	
	
}
