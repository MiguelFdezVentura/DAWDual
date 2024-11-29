package tema2;

public class Ejercicio18Primos2 {

	public static void main(String[] args) 
	{
		int iNum = 2;
		int iContador=0;
		while(iContador!=20)
		{
			int i=2;
			boolean esPrimo = true;
			while(i<=Math.sqrt(iNum) && esPrimo) //Buscar divisores hasta la raiz cuadrada(regla matematica)
			{
				if(iNum%i==0)
				{
					esPrimo = false;
				}
				i++;
			}
			if(esPrimo)
			{
				System.out.println(iNum);
				iContador++;
			}
			iNum++;
		}
	}
}