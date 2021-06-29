

public class Main {

	public static void main(String[] args) {
		
		String[] sistemaOp = {"Windows","Linux", "MacOs", "Otro"};
		
		System.out.println("Bienvenido al sistema");
		
		System.out.println("Ingrese su nombre:");
		String nombre = Utiles.sc.nextLine();
		System.out.println("Ingrese su apellido:");
		String apellido = Utiles.sc.nextLine();
		System.out.println("Ingrese su edad:");
		int edad = Utiles.validarIngreso(1, 90);
		System.out.println("¿Cuál es su hobbie?");
		String hobbie = Utiles.sc.nextLine();
		System.out.println("¿Cuál es su editor de código preferido?");
		String editor = Utiles.sc.nextLine();
		System.out.println("¿Cuál es el sistema operativo que utiliza?");
		for (int i = 0; i < sistemaOp.length; i++) {
			System.out.println( (i+1) + ") " + sistemaOp[i]);
		}
		int rta = Utiles.validarIngreso(1, sistemaOp.length)-1;
		
		String sistOp = null;
		if (rta==sistemaOp.length-1) {
			System.out.println("Ingrese el nombre de su sistema operativo:");
			sistOp = Utiles.sc.nextLine();
		}
		
		System.out.println("Es un gusto darle la bienvenida " + nombre + " " + apellido);
		System.out.println("--------------------------------------------------");
		System.out.println("Información personal:");
		System.out.println("Edad: " + edad);
		System.out.println("Hobbie: " + hobbie);
		System.out.println("Editor de código preferido: " + editor);
		System.out.println("Sistema operativo que utiliza: " + ((rta != (sistemaOp.length-1))? sistemaOp[rta]:sistOp) );
		System.out.println("--------------------------------------------------");
	}

}
