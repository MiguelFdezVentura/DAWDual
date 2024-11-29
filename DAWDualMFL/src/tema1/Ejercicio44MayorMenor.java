package tema1;
import java.util.Scanner;

public class Ejercicio44MayorMenor {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int num1;
	int num2;
	System.out.println("Introduce dos numeros: ");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	int mayor = num1>num2? num1:num2;
	int menor = num1<num2? num1:num2;
	System.out.println("El numero mayor es " + mayor + " y el numero menor es " + menor);
	sc.close();
	}

}
