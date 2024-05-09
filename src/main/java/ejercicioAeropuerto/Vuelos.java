package ejercicioAeropuerto;

public abstract class Vuelos 
{
	private int precioBase;
	private String origen;
	private String destino;
	private int dia;
	private int mes;
	private int horaSalida;
	private int minSalida;
	private int duracionHoras;
	private int duracionMinutos;
	private int cod;
	private int asientosLibres;
	
	public int getAsientosLibres() {
		return asientosLibres;
	}
	public void setAsientosLibres(int asientosLibres) {
		this.asientosLibres = asientosLibres;
	}
	public int getCod() {
		return cod;
	}
	public int getAsientos() {
		return asientosLibres;
	}
	public int getHoraSalida() {
		return horaSalida;
	}
	public int getMinSalida() {
		return minSalida;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public String getOrigen() {
		return origen;
	}
	public String getDestino() {
		return destino;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getDuracionHoras() {
		return duracionHoras;
	}
	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	
	public Vuelos(String origen, String destino, int dia, int mes, int duracionHoras,
			int duracionMinutos, int horaSalida, int asientos, int minSalida, int cod) {
		super();
		this.precioBase =30;
		this.origen = origen;
		this.destino = destino;
		this.dia = dia;
		this.mes = mes;
		this.duracionHoras = duracionHoras;
		this.duracionMinutos = duracionMinutos;
		this.horaSalida=horaSalida;
		this.minSalida=minSalida;
		this.asientosLibres=asientos;
		this.cod=cod;
	}
	
	public abstract double calcularPrecio(int precioBase, int añadido);
	
	public int tiempoLlegada(int inicial, int duracion)
	{
		int tiempoFinal;
		
		tiempoFinal=inicial+duracion;
		if(tiempoFinal>24)
		{
			tiempoFinal-=24;
		}
		
		return tiempoFinal;
	}
	
	public int tiempoLlegadaM(int inicialMin, int duracion)
	{
		int tiempoFinal;
		
		tiempoFinal=inicialMin+duracion;
		while(tiempoFinal>60)
		{
			tiempoFinal-=60;
		}
		
		return tiempoFinal;
	}
}
