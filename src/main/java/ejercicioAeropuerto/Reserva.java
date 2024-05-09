package ejercicioAeropuerto;

import java.util.Scanner;

import ejercicioAeropuerto.VuelosInternacionales.tipoAsiento;
import ejercicioAeropuerto.VuelosInternacionales.tipoClases;

public class Reserva 
{
	Scanner scan = new Scanner(System.in);
	private String nombre;
	private String apellidos;
	private String DNI;
	private tipoClases clase;
	private tipoAsiento asiento;
	private int numAsiento;
	
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getDNI() {
		return DNI;
	}
	public tipoClases getClase() {
		return clase;
	}
	public tipoAsiento getAsiento() {
		return asiento;
	}
	public int getNumAsiento() {
		return numAsiento;
	}
	public Reserva(String nombre, String apellidos, String dNI, tipoClases clase, tipoAsiento asiento, int numAsiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = dNI;
		this.clase = clase;
		this.asiento = asiento;
		this.numAsiento = numAsiento;
	}
	
	/*public void cambiarAsiento(Reserva reserva)
	{
		String claseNueva;
		String nuevoAsiento;
		System.out.println("Nuevo tipo de clase: ");
		
		
	}*/
	
	
}
