package tema1;
import java.util.Scanner;

public class Ejercicio33Media {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int nota1;
	int nota2;
	System.out.println("Introduzca dos notas para calcular la media: ");
	nota1 = sc.nextInt();
	nota2 = sc.nextInt();
	System.out.println("La media de las notas " + nota1 + " y " + nota2 + " es: " + ((nota1 + nota2)/2));
	sc.close();
	}
}