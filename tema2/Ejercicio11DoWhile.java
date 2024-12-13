package tema2;
import java.util.Scanner;

public class Ejercicio11DoWhile {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int iNum = 0;
		int iMayor = Integer.MIN_VALUE;
		System.out.println("Introduce números, 0 para terminar: ");
		do
		{
			if (iNum > iMayor)
				iMayor = iNum;
			System.out.print("Introduce un número: ");
			iNum = sc.nextInt();
		}while(iNum!=0);
		System.out.print("El mayor es: " + iMayor);
		sc.close();
	}

}
