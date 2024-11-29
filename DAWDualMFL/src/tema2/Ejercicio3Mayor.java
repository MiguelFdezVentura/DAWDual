package tema2;
import java.util.Scanner;

public class Ejercicio3Mayor {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Introduce dos numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1 > num2)
			System.out.println("Orden de mayor a menor: " + num1 + " , " + num2);
		else
			System.out.println("Orden de mayor a menor: " + num2 + " , " + num1);
		sc.close();
	}
}
