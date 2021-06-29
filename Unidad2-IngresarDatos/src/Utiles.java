import java.util.InputMismatchException;
import java.util.Scanner;

public class Utiles {
	static Scanner sc = new Scanner(System.in);
	
	public static int validarIngreso(int min, int max) {
		boolean error = false;
		int valor = 0;
		do {
			error = false;
			try {
				valor = sc.nextInt();
				if( !(valor >= min && valor <= max)) {
					System.out.println("El valor no es válido. Debe ingresar un número entre " + min + " y " + max);
					error = true;
				}
			} catch (InputMismatchException inputEx) {
				System.out.println("El valor ingresado no es válido. Debe ingresar un número.");
				error = true;
				sc.nextLine();
			} 
			catch (Exception e) {
				System.out.println("El valor ingresado no es válido.");
				error = true;
				sc.nextLine();
			}
		} while (error);
		sc.nextLine();
		return valor;
	}
}
