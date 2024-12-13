package tema2;
import java.util.Scanner;

public class Ejercicio8NotasSwitch {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double dNota;
		System.out.println("Introduce un numero del 1 al 7: ");
		dNota = sc.nextInt();
		switch((int)dNota)
		{
		case 0,1,2 ->
			System.out.println("Muy deficiente");
		case 3,4 ->
			System.out.println("Insuficiente");
		case 5,6 ->
			System.out.println("Bien");
		case 7,8 ->
			System.out.println("Notable");
		case 9,10 ->
			System.out.println("Sobresaliente");
		default ->
			System.out.println("Error nota no valida. ");
		}
		sc.close();
	}
}
