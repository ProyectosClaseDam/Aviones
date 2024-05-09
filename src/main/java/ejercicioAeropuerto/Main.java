package ejercicioAeropuerto;

import java.util.Scanner;

public class Main 
{
	public static Scanner scan = new Scanner(System.in);
	public static GestionVuelos gestorVuelos;
	
	public static void main(String[] args) 
	{
		gestorVuelos = new GestionVuelos();
		String id;
		int persona;
		int contraseña;
		System.out.println("Introduce como quieres entrar: \n1 - Cliente \n2 - Empleado");
		persona=scan.nextInt();
		
		while(persona==1 || persona==2)
		{
			if(persona==1)
			{
				sesionCliente();
			}
			else if(persona==2)
			{
				System.out.println("Introduce usuario");
				id=scan.next();
				
				if(id.equalsIgnoreCase("Marta"))
				{
					System.out.println("Introduce la contraseña");
					contraseña=scan.nextInt();
					if(contraseña==1234)
					{
						sesionEmpleado();
					}
					else
					{
						System.out.println("Contraseña invalida");
					}
					
				}
				else
				{
					System.out.println("Usuario invalido");
				}
			}
			
			System.out.println("Introduce como quieres entrar: \n1 - Cliente \n2 - Empleado");
			persona=scan.nextInt();
		}
		
		System.out.println("No has introducido ninguna de las opciones que se ofrecen.");
		
	}

	public static void sesionEmpleado()
	{
		int op;
		System.out.println("Introduce la opcion que quieras: \n1 - Vuelos nacionales \n2 - Vuelos internacionales \n0 - salir");
		op=scan.nextInt();
		
		while (op==1||op==2)
		{
			switch(op)
			{
			case 1:
				menuOpcionesVuelos(1);
				break;
			
			case 2:
				menuOpcionesVuelos(2);
				break;
			case 0:
				break;
			}
			
			if(op!=0)
			{
				System.out.println("Introduce la opcion que quieras: \n1 - Vuelos nacionales \n2 - Vuelos internacionales \n0 - salir");
				op=scan.nextInt();
			}
		}		
	}
	
	public static void sesionCliente()
	{
		int op;
		System.out.println("Introduce la opcion que quieras: \n1 - Nueva reserva \n2 - Consultar reserva \n3 - Eliminar reserva \n0 - salir");
		op=scan.nextInt();
		
		while (op==1||op==2||op==3)
		{
			switch(op)
			{
			case 1:
				
				break;
			
			case 2:
				
				break;
			case 3:
				
				break;
			case 0:
				break;
			}
			
			if(op!=0)
			{
				System.out.println("Introduce la opcion que quieras: \n1 - Nueva reserva \n2 - Consultar reserva \n3 - Eliminar reserva \n0 - salir");
				op=scan.nextInt();
			}
		}
	}
	
	//1 es nacional, 2 es internacional
	public static void menuOpcionesVuelos(int nacioOinter)
	{
		int op= 0, codVuelo;
		System.out.println("Introduce la opcion que quieras: \n1 - Añadir vuelo a la lista \n2 - Ver lista de vuelos \n3 - Eliminar vuelo de la lista \n0 - Volver al menu");
		op=scan.nextInt();
		Vuelos vuelo;
		
		if (nacioOinter==1)
		{
			switch(op)
			{
			case 1:
				vuelo=gestorVuelos.crearVueloN();
				gestorVuelos.añadirVueloN(vuelo);
				break;
			case 2:
				gestorVuelos.verVuelosN(gestorVuelos.listaVuelosN);
				break;
			case 3:
				System.out.println("Introduce el codigo del vuelo que quieras eliminar: ");
				codVuelo=scan.nextInt();
				gestorVuelos.eliminarVueloN(gestorVuelos.listaVuelosN, codVuelo);
				break;
			case 0:
				break;
			}
		}
		else if (nacioOinter==2)
		{
			switch(op)
			{
			case 1:
				vuelo=gestorVuelos.crearVueloI();
				gestorVuelos.añadirVueloI(vuelo);
				break;
			case 2:
				gestorVuelos.verVuelosI(gestorVuelos.listaVuelosI);
				break;
			case 3:
				System.out.println("Introduce el codigo del vuelo que quieras eliminar: ");
				codVuelo=scan.nextInt();
				gestorVuelos.eliminarVueloI(gestorVuelos.listaVuelosI, codVuelo);
				break;
			case 0:
				break;
			}
		}
		
	}
}
