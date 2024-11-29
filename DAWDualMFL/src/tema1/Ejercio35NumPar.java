package tema1;
import java.util.Scanner;

public class Ejercio35NumPar {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("Introduzca un numero: ");
	num = sc.nextInt();
	if(num%2==0)
	{
		System.out.println("El numero " + num + " es par.");
	}else{
		System.out.println("El numero " + num + " es impar.");
	}
	sc.close();
	}
}