package tema1;
import java.util.Scanner;

public class Ejercicio31Edad {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int edad;
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		System.out.println("Su edad acutal es: " + edad + "\nSu edad en un año sera: " + (edad+1));
		sc.close();
	}

}
