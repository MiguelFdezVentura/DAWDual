package tema1;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio34Circulo {

	public static void main(String[] args) 
	{	
	Scanner sc = new Scanner(System.in);
	int r;
	System.out.print("Introduzca el radio del circulo:");
	r=sc.nextInt();
	System.out.println("La circunferencia de radio " + r +" es: " + (2*r*Math.PI));
	System.out.println("El area de la circunferencia de radio " + r + " es: " + (Math.PI*r*r));
	sc.close();
	}

}
