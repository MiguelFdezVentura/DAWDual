package tema3.tiendaelec;

public class Television extends Electrodomesticos{
	private static final int RESOLUCION_BASE = 32;
	private int iResolucion;
	
	/**
	 * @param iResolucion
	 */
	public Television(int iResolucion) {
		super();
		this.iResolucion = iResolucion;
	}
	
	public Television() {
		super();
		this.iResolucion = RESOLUCION_BASE;
	}
	
	public int getiResolucion() {
		return iResolucion;
	}
	
	public void setiResolucion(int iResolucion) {
		this.iResolucion = iResolucion;
	}

	@Override
	public String toString() {
		return "Television [iResolucion=" + iResolucion + ", dPotencia=" + dPotencia + ", iHoras=" + iHoras + ", iDias="
				+ iDias + ", dPrecioEnergia=" + dPrecioEnergia + "]";
	}
	
	public double consumoAnual(){
		return (super.consumoAnual()*1.2);
	}
}
