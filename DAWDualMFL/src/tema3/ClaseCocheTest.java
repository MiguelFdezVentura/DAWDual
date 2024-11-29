package tema3;

public class ClaseCocheTest {

	public static void main(String[] args) 
	{
		ClaseCoche cocheAlejandro = new ClaseCoche("Rojo", 200, 2);
		cocheAlejandro.avanzar();
		cocheAlejandro.girarIzquierda();
		//cocheAlejandro.parar();
		cocheAlejandro.imprimirDatosCoche();
		
		ClaseCoche cocheDiego = new ClaseCoche("Blanco", 280, 3.5, 3, 4);
		cocheDiego.avanzar();
		cocheDiego.girarIzquierda();
		//cocheDiego.parar();
		cocheDiego.imprimirDatosCoche();
	}

}
