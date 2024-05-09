package ejercicioAeropuerto;

import java.util.Scanner;

public class Main 
{
	public static Scanner scan = new Scanner(System.in);
	public static GestionVuelos gestorVuelos;
	
	public static void main(String[] args) 
	{
		String persona, id;
		int contraseña;
		System.out.println("¿Eres cliente o empleado?");
		persona=scan.next();
		
		while(persona=="cliente" || persona=="empleado")
		{
			if(persona=="cliente")
			{
				sesionCliente();
			}
			else if(persona=="empleado")
			{
				System.out.println("Introduce usuario");
				id=scan.next();
				
				if(id=="Marta")
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
			
			System.out.println("¿Eres cliente o empleado?");
			persona=scan.next();
		}
		
		System.out.println("No has introducido ninguna de las opciones que se ofrecen.");
		
	}

	public static void sesionEmpleado()
	{
		int op, opcionVuelos;
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
				menuOpcionesVuelos(1);
				break;
			case 0:
				System.out.println("Cerrando sesion");
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
		
	}
	
	//1 es nacional, 2 es internacional
	public static void menuOpcionesVuelos(int nacioOinter)
	{
		int op= 0;
		System.out.println("Introduce la opcion que quieras: \n1 - Crear vuelo \n2 - Añadir vuelo a la lista \n3 - Ver lista de vuelos \n4 - Eliminar vuelo de la lista \n0 - Volver al menu");
		op=scan.nextInt();
		
		if (nacioOinter==1)
		{
			switch(op)
			{
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				break;
			}
		}
		else if (nacioOinter==2)
		{
			
		}
		
	}
}
