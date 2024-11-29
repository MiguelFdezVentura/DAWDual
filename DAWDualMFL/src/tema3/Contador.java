package tema3;

public class Contador {
	static int contador = 0;
	
	Contador(){
		contador++;
		System.out.println("Contructor de contador: " +contador);		
	}

	@Override
	public String toString() {
		return "Contador [contador=" + contador + "]";
	}
}
