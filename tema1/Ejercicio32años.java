package tema1;
import java.util.Scanner;

public class Ejercicio32años {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int nacimiento;
	final int año = 2024;
	System.out.println("Introduzca su año de nacimiento: ");
	nacimiento = sc.nextInt();
	System.out.println("Su edad actual es: " + (año - nacimiento));
	sc.close();
	}

}
