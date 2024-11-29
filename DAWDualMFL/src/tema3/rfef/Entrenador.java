package tema3.rfef;

public class Entrenador {
	private String nombre;
	private int edad;
	private int añosExperiencia;
	private int titulos;
	/**
	 * @param nombre
	 * @param edad
	 * @param añosExperiencia
	 * @param titulos
	 */
	public Entrenador(String nombre, int edad, int añosExperiencia, int titulos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.añosExperiencia = añosExperiencia;
		this.titulos = titulos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAñosExperiencia() {
		return añosExperiencia;
	}
	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}
	public int getTitulos() {
		return titulos;
	}
	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}
	
	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", edad=" + edad + ", añosExperiencia=" + añosExperiencia + ", titulos="
				+ titulos + "]";
	}
}
