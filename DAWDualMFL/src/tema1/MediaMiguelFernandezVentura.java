package tema1;
import java.util.Scanner;

public class MediaMiguelFernandezVentura {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	float nota1;
	float nota2;
	System.out.println("Introduzca dos notas para calcular la media: ");
	nota1 = sc.nextFloat();
	nota2 = sc.nextFloat();
	System.out.println("La media de las notas " + nota1 + " y " + nota2 + " es: " + ((nota1 + nota2)/2));
	sc.close();
	}
}