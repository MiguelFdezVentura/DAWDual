package tema1;
import java.util.Scanner;

public class Ejercicio43NumReves {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("Introduce un numero entre 0 y 99999");
	num = sc.nextInt();
	int Rest1 = num % 10;
	int Rest2 = num/10 % 10;
	int Rest3 = num/100 % 10;
	int Rest4 = num/1000 % 10;
	int Rest5 = num/10000 % 10;
	System.out.println("El numero al reves de " + num + " es " + Rest1 + Rest2 + Rest3 + Rest4 + Rest5);
	sc.close();
	}
}
