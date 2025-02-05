package objetos;

public class Noble extends Persona {
	Propiedad[] propiedades;
	int riqueza;
	Noble conyuge;
	
	public Noble(String nombre) {
		super(nombre);
		this.salud=10;
		this.conyuge=null;
		this.riqueza=10000;
		propiedades=new Propiedad[30];
		// TODO Auto-generated constructor stub
	}

	

public void presentarse() {
		
		System.out.println("Saludos, soy "+ this.nombre);
		
	}

public void duelear(Noble elOtro) {
	if(Math.random()>0.5f) {
		this.salud-=4;
		System.out.println("He perdido, :(");
	}
	else {
		elOtro.salud-=4;
		System.out.println("¡Gané!");
	}
	
}

public void casarse(Noble elContrario) {
	this.conyuge=elContrario;
	elContrario.conyuge=this;
	
}

public boolean comprar(Propiedad propiedad) {
	
	boolean comprado=false;
	if(this.riqueza>=propiedad.valor) {
		
		int i=0;
		
		while(i<propiedades.length && !comprado) {
			if(propiedades[i]==null) {
				propiedades[i]=propiedad;
				this.riqueza-=propiedad.valor;
				comprado=true;	
			}
			
			
		}
		
	}
	return comprado;
}

}
