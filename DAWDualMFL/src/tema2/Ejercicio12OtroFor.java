package tema2;

public class Ejercicio12OtroFor {

	public static void main(String[] args) 
	{
		for(int i=0, j=0; i<5 && j<5; i++, j++)
		{
			System.out.println(i + j);
		}
		
		System.out.println("\nOtro ejemplo:");
		
		int i = 5;
		int j = ++i; //primero incremento y luego asigno
		int k = i++; //primero asigno y luego incremento
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}
