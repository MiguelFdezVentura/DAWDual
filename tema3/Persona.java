package tema3;

public class Persona 
{
	
	//Variables que pertenecen a una persona
	private String sNombre;
	private byte bEdad;
	private double dEstatura;
	
	//Contructor con nombre, edad y estatura
	/**
	 * @param paramNombre
	 * @param paramEdad
	 * @param paramEstatura
	 */
	public Persona(String paramNombre, byte paramEdad, double paramEstatura){
		this.sNombre=paramNombre;
		this.bEdad=paramEdad;
		this.dEstatura=paramEstatura;
	}
	
	//Función para cambiar(aumentar) la estatura
	/**
	 * @param dIncremento
	 */
	public void crecer(double dIncremento) {
	if(dIncremento>0)
		this.dEstatura+=dIncremento;
	else
		System.out.print("La cantidad introducida no es un incremento.");
	}
	
	//Función para cambiar la edad(cumplir años)
	/**
	 * 
	 */
	public void cumplirAnyos() {
		this.bEdad++;
	}
	
	//Funcion para devolver valor de la edad
	/**
	 * @return
	 */
	public byte getEdad() {
		return this.bEdad;
	}
	
	//Funcion para devolver valor de la estatura
	/**
	 * @return
	 */
	public double getEstatura() {
		return this.dEstatura;
	}
	
	//Funcion para devolver valor del nombre
	/**
	 * @return
	 */
	public String getNombre() {
		return this.sNombre;
	}
	
	//Funcion para saludar con el nombre
	/**
	 * 
	 */
	public void saludar() {
		System.out.print("Hola. Mi nombre es " + this.sNombre + ".\nEncantado de concocerte.");
	}
	
	//Funcion para cambiar el valor de la edad
	/**
	 * @param paramEdad
	 */
	public void setEdad(byte paramEdad) {
		this.bEdad=paramEdad;
	}
	
	//Funcion para cambiar el valor de la estatura
	/**
	 * @param paramEstatura
	 */
	public void setEstatura(double paramEstatura) {
		this.dEstatura=paramEstatura;
	}
	
	//Funcion para cambiar el valor del nombre
	/**
	 * @param paramNombre
	 */
	public void setNombre(String paramNombre) {
		this.sNombre=paramNombre;
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Persona [sNombre=" + sNombre + ", bEdad=" + bEdad + ", dEstatura=" + dEstatura + "]";
	}
	
}