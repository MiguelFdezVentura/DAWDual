package tema1;
import java.util.Scanner;

public class Ejercicio3Ope {

	public static void main(String[] args) {
		//Escribe un programa que pida por pantalla dos numeros
		// y muestre el resultado de la +, -, *, y la /
		Scanner sc = new Scanner (System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print("Escribe el primer numero para los distintos calculos: ");
		num1 = sc.nextInt();
		System.out.print("Escribe el segundo numero para los distintos calculos: ");
		num2 = sc.nextInt();
		System.out.println("El resultado de la suma es: " + (num1 + num2));
		System.out.println("El resultado de la resta es: " + (num1 - num2));
		System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
		System.out.println("El resultado de la division es: " + (num1 / num2));
		sc.close();
	}

}
