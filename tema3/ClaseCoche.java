package tema3;

public class ClaseCoche
{
	//Atrirbutos que iene la clase coche
	private String sColor;
	private int iVelocidad;
	private double dSize;
	private int iPosicionX;
	private int iPosicionY;
	
	//Constructor de la clase, permite crear objetos de la clase coche
	public ClaseCoche(String paramColor, int paramVelocidad, double paramSize) 
	{
		this.sColor=paramColor;
		this.iVelocidad=paramVelocidad;
		this.dSize=paramSize;
		this.iPosicionX=0;
		this.iPosicionY=0;
	}
	
	public ClaseCoche(String paramColor, int paramVelocidad, double paramSize, int paramPosicionX, int paramPosicionY) 
	{
		this.sColor=paramColor;
		this.iVelocidad=paramVelocidad;
		this.dSize=paramSize;
		this.iPosicionX=paramPosicionX;
		this.iPosicionY=paramPosicionY;
	}
	
	//Métodos que actúan sobre los objetos de la clase coche
	
	public void avanzar() 
	{
		this.iPosicionX+=1;
		this.iPosicionY+=1;
	};
	public void parar() 
	{
		this.iPosicionX=0;
		this.iPosicionY=0;
	};
	public void girarIzquierda() 
	{
		this.iPosicionX+=1;
	};
	public void girarDerecha() 
	{
		this.iPosicionY+=1;
	};
	public void imprimirDatosCoche() 
	{
		System.out.println("El color es: " + this.sColor);
		System.out.println("La velocidad es: " + this.iVelocidad);
		System.out.println("El tamaño es: " + this.dSize);
		System.out.println("La posicion X es: " + this.iPosicionX);
		System.out.println("La posicion Y es: " + this.iPosicionY);
	}
}