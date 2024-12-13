package tema2;
import java.util.Scanner;

public class Ejercicio1Par {

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		int num;
		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		if (num%2==0)
			System.out.print("El numero " + num + " es par." );
		else
			System.out.print("El numero " + num + " es impar." );
		sc.close();
	}

}
