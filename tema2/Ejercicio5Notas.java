package tema2;
import java.util.Scanner;

public class Ejercicio5Notas {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double nota;
		System.out.println("Introduce tu nota: ");
		nota = sc.nextDouble();
		if(nota>10 || nota<0)
			System.out.println("Este no es un valor apropiado. ");
		else if(nota<3)
			System.out.println("Muy deficiente.");
		else if(nota<5)
			System.out.println("Insuficiente.");
		else if(nota<6)
			System.out.println("Bien.");
		else if(nota<9)
			System.out.println("Notable.");
		else if(nota<=10)
			System.out.println("Sobresaliente");
		sc.close();
	}

}
