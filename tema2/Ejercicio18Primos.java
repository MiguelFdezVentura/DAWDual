package tema2;

public class Ejercicio18Primos {

	public static void main(String[] args) 
	{
		int iNum = 2;
		int iContador=0;
		int iDiv;
		while(iContador!=21)
		{
			iDiv=0;
			for(int j=2; j<iNum/2 && iDiv==0;j++)
			{
				if(iNum%j==0)
				{
					iDiv++;
				}	
			}
			if(iDiv==0)
			{
				System.out.println(iNum);
				iContador++;
			}
			iNum++;
		}
	}
}