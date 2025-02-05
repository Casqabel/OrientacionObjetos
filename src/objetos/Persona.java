package objetos;

public class Persona {
	String nombre;
	int edad;
	float altura;
	float peso;
	boolean pelo;
	
	int hambre;
	int suenyo;
	int higiene;
	int salud;
	
	public Persona(String nombre) {
		this.nombre=nombre;
		this.edad=0;
		this.altura=(float) (Math.random()*0.2f+0.4f);
		this.peso=(float) (Math.random()*3.0f+3.0f);
		this.salud=8;
		if(Math.random()>0.5f) {
			this.pelo=true;
			
		}
		else {
			this.pelo=false;
		
		}
		
		this.hambre=0;
		this.suenyo=5;
		this.higiene=0;
		
		
	}
	
	public void comer(int alimento) {
		this.hambre-=alimento;
		if(this.hambre<0) {
			this.hambre=0;
			this.peso*=1.05f;
		}
	}
	
	public void dormir(int hSueño) {
		if(hSueño>8) {
			
			this.suenyo=0;
		}
		else {
			this.suenyo=10*hSueño/8;
		}
		
	}
	
	public void tomarBanyo() {
		this.higiene=10;
		
	}
	
	public void ejercicio() {
		this.peso*=0.95f;
		this.higiene=3;
		this.suenyo-=2;
		
	}
	
	public void cumpleanyos() {
		this.edad+=1;
	}
	
	public void presentarse() {
		
		System.out.println("Hola soy "+ this.nombre);
		
	}

}
