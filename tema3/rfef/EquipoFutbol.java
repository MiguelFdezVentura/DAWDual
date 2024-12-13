package tema3.rfef;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {
	private String nombreEquipo;
	private String ciudad;
	private String nombreCampo;
	private LocalDate fechaFundacion;
	private Entrenador entrenador;
	private Portero porteroTitular;
	private Defensa central1;
	private Defensa central2;
	private Defensa interiorIzq;
	private Defensa interiorDcha;
	private Centrocampista centrocampista1;
	private Centrocampista centrocampista2;
	private Centrocampista centrocampista3;
	private Delantero extremoIzq;
	private Delantero extremoDcha;
	private Delantero delanteroCentro;
	private int puntos=0;
	/**
	 * @param nombreEquipo
	 * @param ciudad
	 * @param nombreCampo
	 * @param fechaFundacion
	 * @param entrenador
	 * @param porteroTitular
	 * @param central1
	 * @param central2
	 * @param interiorIzq
	 * @param interiorDcha
	 * @param centrocampista1
	 * @param centrocampista2
	 * @param centrocampista3
	 * @param extremoIzq
	 * @param extremoDcha
	 * @param delanteroCentro
	 * @param puntos
	 */
	public EquipoFutbol(String nombreEquipo, String ciudad, String nombreCampo, LocalDate fechaFundacion,
			Entrenador entrenador, Portero porteroTitular, Defensa central1, Defensa central2, Defensa interiorIzq,
			Defensa interiorDcha, Centrocampista centrocampista1, Centrocampista centrocampista2,
			Centrocampista centrocampista3, Delantero extremoIzq, Delantero extremoDcha, Delantero delanteroCentro, int puntos) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.ciudad = ciudad;
		this.nombreCampo = nombreCampo;
		this.fechaFundacion = fechaFundacion;
		this.entrenador = entrenador;
		this.porteroTitular = porteroTitular;
		this.central1 = central1;
		this.central2 = central2;
		this.interiorIzq = interiorIzq;
		this.interiorDcha = interiorDcha;
		this.centrocampista1 = centrocampista1;
		this.centrocampista2 = centrocampista2;
		this.centrocampista3 = centrocampista3;
		this.extremoIzq = extremoIzq;
		this.extremoDcha = extremoDcha;
		this.delanteroCentro = delanteroCentro;
		this.puntos = puntos;
	}
	
	public EquipoFutbol(String nombreEquipo, String ciudad, String nombreCampo, LocalDate fechaFundacion,
			Entrenador entrenador, Portero porteroTitular, Defensa central1, Defensa central2, Defensa interiorIzq,
			Defensa interiorDcha, Centrocampista centrocampista1, Centrocampista centrocampista2,
			Centrocampista centrocampista3, Delantero extremoIzq, Delantero extremoDcha, Delantero delanteroCentro) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.ciudad = ciudad;
		this.nombreCampo = nombreCampo;
		this.fechaFundacion = fechaFundacion;
		this.entrenador = entrenador;
		this.porteroTitular = porteroTitular;
		this.central1 = central1;
		this.central2 = central2;
		this.interiorIzq = interiorIzq;
		this.interiorDcha = interiorDcha;
		this.centrocampista1 = centrocampista1;
		this.centrocampista2 = centrocampista2;
		this.centrocampista3 = centrocampista3;
		this.extremoIzq = extremoIzq;
		this.extremoDcha = extremoDcha;
		this.delanteroCentro = delanteroCentro;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNombreCampo() {
		return nombreCampo;
	}
	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	public Portero getPorteroTitular() {
		return porteroTitular;
	}
	public void setPorteroTitular(Portero porteroTitular) {
		this.porteroTitular = porteroTitular;
	}
	public Defensa getCentral1() {
		return central1;
	}
	public void setCentral1(Defensa central1) {
		this.central1 = central1;
	}
	public Defensa getCentral2() {
		return central2;
	}
	public void setCentral2(Defensa central2) {
		this.central2 = central2;
	}
	public Defensa getInteriorIzq() {
		return interiorIzq;
	}
	public void setInteriorIzq(Defensa interiorIzq) {
		this.interiorIzq = interiorIzq;
	}
	public Defensa getInteriorDcha() {
		return interiorDcha;
	}
	public void setInteriorDcha(Defensa interiorDcha) {
		this.interiorDcha = interiorDcha;
	}
	public Centrocampista getCentrocampista1() {
		return centrocampista1;
	}
	public void setCentrocampista1(Centrocampista centrocampista1) {
		this.centrocampista1 = centrocampista1;
	}
	public Centrocampista getCentrocampista2() {
		return centrocampista2;
	}
	public void setCentrocampista2(Centrocampista centrocampista2) {
		this.centrocampista2 = centrocampista2;
	}
	public Centrocampista getCentrocampista3() {
		return centrocampista3;
	}
	public void setCentrocampista3(Centrocampista centrocampista3) {
		this.centrocampista3 = centrocampista3;
	}
	public Delantero getExtremoIzq() {
		return extremoIzq;
	}
	public void setExtremoIzq(Delantero extremoIzq) {
		this.extremoIzq = extremoIzq;
	}
	public Delantero getExtremoDcha() {
		return extremoDcha;
	}
	public void setExtremoDcha(Delantero extremoDcha) {
		this.extremoDcha = extremoDcha;
	}
	public Delantero getDelanteroCentro() {
		return delanteroCentro;
	}
	public void setDelanteroCentro(Delantero delanteroCentro) {
		this.delanteroCentro = delanteroCentro;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public void partidoPuntos(int puntos) {
		this.puntos += puntos;
	}
	
	// Lista que contiene todos los jugadores de los equipos
	public List<Object> jugadores() {
		List<Object> lista1 = new ArrayList<>();

		// Agregar elementos de diferentes tipos
		lista1.add(getDelanteroCentro());
		lista1.add(getExtremoIzq());
		lista1.add(getExtremoDcha());
		lista1.add(getCentrocampista1());
		lista1.add(getCentrocampista2());
		lista1.add(getCentrocampista3());
		lista1.add(getCentral1());
		lista1.add(getCentral2());
		lista1.add(getInteriorIzq());
		lista1.add(getInteriorDcha());
		lista1.add(getPorteroTitular());
		return lista1;
	}
	
	public Object jugador(int i) {
		List<Object> lista1 = new ArrayList<>();
		
		// Agregar elementos de diferentes tipos
		lista1.add(getDelanteroCentro());
		lista1.add(getExtremoIzq());
		lista1.add(getExtremoDcha());
		lista1.add(getCentrocampista1());
		lista1.add(getCentrocampista2());
		lista1.add(getCentrocampista3());
		lista1.add(getCentral1());
		lista1.add(getCentral2());
		lista1.add(getInteriorIzq());
		lista1.add(getInteriorDcha()); // En los bucles de para asignar valores solo llega hasta aqui el numero 10
		lista1.add(getCentrocampista2());
		lista1.add(getPorteroTitular());
		/** En caso de que el goleador y asistidor son el interior derecha (improbable)
		 * añado otra vez un jugador cualquiera (centrocampista2) para que al asignar 
		 * la asistencia al siguiente en la lista haya un jugador (objeto)
		**/
		return lista1.get(i);
	}

	@Override
	public String toString() {
		return "EquipoFutbol [nombreEquipo=" + nombreEquipo + ", ciudad=" + ciudad + ", nombreCampo=" + nombreCampo
				+ ", fechaFundacion=" + fechaFundacion + ", entrenador=" + entrenador + ", porteroTitular="
				+ porteroTitular + ", central1=" + central1 + ", central2=" + central2 + ", interiorIzq=" + interiorIzq
				+ ", interiorDcha=" + interiorDcha + ", centrocampista1=" + centrocampista1 + ", centrocampista2="
				+ centrocampista2 + ", centrocampista3=" + centrocampista3 + ", extremoIzq=" + extremoIzq
				+ ", extremoDcha=" + extremoDcha + ", delanteroCentro=" + delanteroCentro + ", puntos=" + puntos + "]";
	}
}
