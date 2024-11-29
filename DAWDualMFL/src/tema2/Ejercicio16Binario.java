package tema2;
import java.util.Scanner;
//Pasar un numero a binario

public class Ejercicio16Binario {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int iNum = 0;
		int i = 0;
		System.out.println("Introduce un numero para pasarlo a binario.");
		iNum = sc.nextInt();
		while(Math.pow(2, i)<=iNum)
		{
			i++;
		}
		i--;
		while(i>=0)
		{
		if(Math.pow(2, i)<=iNum)
		{
			iNum -= Math.pow(2, i);
			System.out.print("1");
		}
		else
		{
			System.out.print("0");
		}
			i--;
		}
		sc.close();

	}
}
