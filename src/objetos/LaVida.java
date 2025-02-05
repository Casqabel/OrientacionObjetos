package objetos;

public class LaVida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1, persona2;
		persona1=new Persona("Enrique");
		persona2=new Noble("Antonia");
		
		persona1.presentarse();
		persona2.presentarse();
		
		persona2.tomarBanyo();
		
		
		System.out.println("Hola soy "+ persona1.nombre+
				" mi higiene es: "+persona1.higiene);
		System.out.println("Hola soy "+ persona2.nombre+
				" mi higiene es: "+persona2.higiene);
		
		for(int i=0; i<20; i++) {
			persona1.cumpleanyos();
			persona2.cumpleanyos();
			System.out.println("Hola soy "+ persona2.nombre+
					" mi edad es: "+persona2.edad);
			
		}
		
		
	}

}
