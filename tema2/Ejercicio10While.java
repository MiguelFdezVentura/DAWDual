package tema2;

public class Ejercicio10While {

	public static void main(String[] args) 
	{
		//Contador 1 al 5
		int contador = 1;
		while (contador<=5)
		{
			System.out.print(contador + " ");
			contador++;
		}
		System.out.println();
		
		
		//Contador 5 al 1
		contador = 5;
		while (contador>=1)
		{
			System.out.print(contador + " ");
			contador--;
		}
		System.out.println();
		
		
		//Los pares del 1 al 10
		contador = 1;
		while (contador<=10)
		{
			if(esPar(contador))
			{
				System.out.print(contador + " ");
			}
			contador++;
		}
		System.out.println();
		
		
		//pintar triangulo
		pintarTrianguloD();
		
		pintarTrianguloC();
	} //fin main
	
	//Funcion para pintar un triangulo alineado a la derecha
	private static void pintarTrianguloC()
	{
		int filas=5;
		for (int i=1; i<=filas;i++)
		{
			for (int j=filas; j>i;j--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Funcion para pintar un triangulo alineado al centro
	private static void pintarTrianguloD()
	{
		int filas=5;
		for (int i=1; i<=filas;i++)
		{
			for (int j=filas; j>i;j--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	//Funcion para ver si es par
	private static boolean esPar(int iNum)
	{
		/*
		 * boolean bEsPar=false;
		 * if(iNum%2==0)
		 * 	bEsPar=true
		 * return bEsPar;
		 */
		return (iNum%2==0);
	}

}
