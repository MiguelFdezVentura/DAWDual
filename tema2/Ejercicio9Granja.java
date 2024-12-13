/*
 * En una granja se compra diariamente una cantidad (comidaDiaria) de comida para
 * los animales.
 * El numero de animales que alimentar (todos de la misma especie) es numAniumales,
 * y sabemos que cada animal come una media de kilosPorAnimal.
 * Diseña un programa que solicite al usuario:
 * -Cantidad de comida
 * -Número de animales
 * -Kilos por animal
 * y nos diga si tenemos alimento suficiente para cada animal.
 * En caso negativo, ha de calcular la ración a repartir entre los animales
 * (tener en cuenta que no se puede dividir por cero)
 */
package tema2;
import java.util.Scanner;

public class Ejercicio9Granja {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int iAnimales;
		double dComida;
		double dMediaAnimalComida;
		//Pido los datos
		System.out.println("Introduce cuantos animales tiene la granja: ");
		iAnimales = sc.nextInt();
		System.out.println("Introduce cuanta comida tiene la granja: ");
		dComida = sc.nextDouble();
		System.out.println("Introduce cuanto comen los animales: ");
		dMediaAnimalComida = sc.nextDouble();
		
		//Pongo una condicion por cada posible escenario
		if(dComida<0) //Numero negativo
			System.out.println("No se puede repartir si la cantidad es 0. ");
		else if(dComida==0) //No hay comida no comen
			System.out.println("No hay comida para ningun animal, no comen nada. ");
		else if(dComida>=(iAnimales*dMediaAnimalComida)) //Hay suficiente comida y sobra x
			System.out.println("Hay suficiente comida para cada animal. " + "\nY sobra: " + (dComida - iAnimales*dMediaAnimalComida) + " kg de comida. ");
		else if (dComida<(iAnimales*dMediaAnimalComida)) //No hay suficiente comida y la reparto equitativamente por animal
			System.out.println("No hay suficiente comida para cada animal. " + "\nLe toca a cada animal: " + (dComida/iAnimales) + " kg de comida. ");

		sc.close();
	}

}
