package tema2;
import java.util.Scanner;
//Programa que pida un número y calcule su factorial. // por ejemplo: el factorial de 10 es:  10*9*8*7*6*5*4*3*2*1

public class Ejercicio13bucle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int iFactorial; //variable que almacena el factorial a calcular
		int iResultado = 1; //variable que almacena el calculo del factorial
		System.out.println("Introduce un numero positivo para calcular el factorial: ");
		iFactorial = sc.nextInt();
		for(int i = 1; i<=iFactorial; i++) //bucle que pasa del 1  hasta el numero factorial
		{
			iResultado *= i; //multiplico el valor de cada numero del 1 hasta el numero factorial
		}
		System.out.println(iFactorial + "! = " + iResultado); //El resultado
		sc.close();
	}

}
