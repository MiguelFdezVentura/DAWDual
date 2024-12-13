package tema2;
import java.util.Scanner;

public class Ejercicio2Iguales {

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		int num1, num2;
		System.out.println("Introduce dos numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1==num2)
			System.out.print("El numero " + num1 + " y " + num2 + " son iguales." );
		else
			System.out.print("El numero " + num1 + " y " + num2 + " no son iguales." );
		sc.close();
	}

}
