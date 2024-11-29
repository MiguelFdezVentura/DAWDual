package tema3.profesor;

public class ProfesorFernandezVenturaLopez {
	
	public enum modulo{
		BBDD,MARCAS,PROGRAMACION,ENTORNOS,INTERFACES
	}
	
	//Private atributos
	private String sDniProfesor;
	private String sNombre;
	private String sApellidos;
	private int iEdad;
	
	//Protected atributos
	protected float fNomina;
	
	private modulo asignaturas;

	/**
	 * @param sDniProfesor
	 * @param sNombre
	 * @param sApellidos
	 * @param iEdad
	 * @param asignaturas
	 */
	public ProfesorFernandezVenturaLopez(String sDniProfesor, String sNombre, String sApellidos, int iEdad,
			modulo asignaturas) {
		super();
		this.sDniProfesor = sDniProfesor;
		this.sNombre = sNombre;
		this.sApellidos = sApellidos;
		this.iEdad = iEdad;
		this.asignaturas = asignaturas;
	}
	
	
	@Override
	public String toString() {
		return "ProfesorFernandezVenturaLopez [sDniProfesor=" + sDniProfesor + ", sNombre=" + sNombre + ", sApellidos="
				+ sApellidos + ", iEdad=" + iEdad + ", fNomina=" + fNomina + ", asignaturas=" + asignaturas + "]";
	}

	public void importeNomina(float fSueldoBase, float fComplementos, float fDeducciones) {
		this.fNomina = fSueldoBase+fComplementos-fDeducciones;
	}
	
	public boolean equals(ProfesorFernandezVenturaLopez otro){
		if(this.fNomina==otro.fNomina) {
			return true;
		}else {
			return false;
		}
	}
}
