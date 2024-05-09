package ejercicioAeropuerto;

import java.util.ArrayList;
import java.util.Scanner;

import ejercicioAeropuerto.VuelosInternacionales.tipoAsiento;
import ejercicioAeropuerto.VuelosInternacionales.tipoClases;

public class GestionReservas 
{
	ArrayList<Reserva> listaReservas;
	Scanner scan = new Scanner(System.in);
	
	GestionReservas()
	{
		listaReservas  = new ArrayList();
	}
	
	public Reserva crearNuevaReserva()
	{
		String nombre, apellidos, DNI;
		tipoClases clase;
		tipoAsiento asiento;
		int numAsiento;		
		Reserva nueva;
		
		System.out.println();
		
		nueva = new Reserva();
		
		return nueva;
	}
	
	public void añadirReserva(Reserva nuevaReserva)
	{
		
	}
}
