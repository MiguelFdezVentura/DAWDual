package tema2;

public class Ejercicio12For {

	public static void main(String[] args) 
	{
		//for del 1 al 10
		System.out.print("Cuenta ascendente\n");
		for(int i = 0; i<=10; i++)
		{
			System.out.print(i + " ");
		}
		
		//for del 10 al 1
		System.out.print("\nCuenta regresiva\n");
		for(int i = 10; i>=0; i--)
		{
			System.out.print(i + " ");
		}
		
		System.out.print("\nNumeros Pares\n");
		for(int i = 0; i<=10; i+=2)
		{
			System.out.print(i + " ");
		}
		
		int iSuma = 0;
		System.out.print("\nSuma 100 numeros\n");
		for(int i = 0; i<=100; i++)
		{
			iSuma += i;
		}
		System.out.print("La suma del 1 al 100 numeros es: " + iSuma + "\n");
	}

}
