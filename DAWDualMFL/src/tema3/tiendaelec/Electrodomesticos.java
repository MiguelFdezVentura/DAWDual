package tema3.tiendaelec;

public class Electrodomesticos {
	//Valores defecto
	protected static final String MARCA_BASE = "bosch";
	protected static final String MODELO_BASE = "modelo 7200";
	protected static final double PRECIO_ELECTRO = 400;
	protected static final String COLOR_BASE = "gris";
	protected static final double POTENCIA_BASE = 2300;
	protected static final int HORAS_BASE = 1;
	protected static final int DIAS_BASE = 3;
	protected static final double PRECIO_ENERGIA_BASE = 0.40397;
	//Atributos private
	private String sMarca;
	private String sModelo;
	private double dPrecioElectrodom;
	private String sColor;
	//Atributos protected
	protected double dPotencia;
	protected int iHoras;
	protected int iDias;
	protected double dPrecioEnergia;
	
	/**
	 * @param sMarca
	 * @param sModelo
	 * @param dPrecioElectrodom
	 */
	public Electrodomesticos(String sMarca, String sModelo, double dPrecioElectrodom) {
		this(sMarca,sModelo,dPrecioElectrodom,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE);
	}

	/**
	 * @param sMarca
	 * @param sModelo
	 * @param dPrecioElectrodom
	 * @param sColor
	 * @param dPotencia
	 * @param iHoras
	 * @param iDias
	 * @param dPrecioEnergia
	 */
	public Electrodomesticos(String sMarca, String sModelo, double dPrecioElectrodom, String sColor, double dPotencia,
			int iHoras, int iDias, double dPrecioEnergia) {
		super();
		this.sMarca = sMarca;
		this.sModelo = sModelo;
		this.dPrecioElectrodom = dPrecioElectrodom;
		this.sColor = sColor;
		this.dPotencia = dPotencia;
		this.iHoras = iHoras;
		this.iDias = iDias;
		this.dPrecioEnergia = dPrecioEnergia;
	}

	public Electrodomesticos() {
		this(MARCA_BASE,MODELO_BASE,PRECIO_ELECTRO,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE);
	}

	public String getsMarca() {
		return sMarca;
	}

	public void setsMarca(String sMarca) {
		this.sMarca = sMarca;
	}

	public String getsModelo() {
		return sModelo;
	}

	public void setsModelo(String sModelo) {
		this.sModelo = sModelo;
	}

	public double getdPrecioElectrodom() {
		return dPrecioElectrodom;
	}

	public void setdPrecioElectrodom(double dPrecioElectrodom) {
		this.dPrecioElectrodom = dPrecioElectrodom;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}

	public double getdPotencia() {
		return dPotencia;
	}

	public void setdPotencia(double dPotencia) {
		this.dPotencia = dPotencia;
	}

	public int getiHoras() {
		return iHoras;
	}

	public void setiHoras(int iHoras) {
		this.iHoras = iHoras;
	}

	public int getiDias() {
		return iDias;
	}

	public void setiDias(int iDias) {
		this.iDias = iDias;
	}

	public double getdPrecioEnergia() {
		return dPrecioEnergia;
	}

	public void setdPrecioEnergia(double dPrecioEnergia) {
		this.dPrecioEnergia = dPrecioEnergia;
	}

	@Override
	public String toString() {
		return "Electrodomesticos [sMarca=" + sMarca + ", sModelo=" + sModelo + ", dPrecioElectrodom="
				+ dPrecioElectrodom + ", sColor=" + sColor + ", dPotencia=" + dPotencia + ", iHoras=" + iHoras
				+ ", iDias=" + iDias + ", dPrecioEnergia=" + dPrecioEnergia + "]";
	}
	
	public double consumoAnual() {
		return ((dPotencia/1000)*iHoras*iDias*dPrecioEnergia*52);
	}
}
