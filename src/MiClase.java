import java.util.Scanner;

public class MiClase {

	public static void main(String[] args)
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ingrese el tamano de la agenda: ");
		int tam = s.nextInt();
		
		String nombres[] = new String[tam];
		int telefonos[] = new int[tam]; 
		
		int opcion = 0;
		do
		{
			System.out.println("Menu");
			System.out.println("1: Ingresar un numero");
			System.out.println("2: Buscar por posicion");
			System.out.println("3: Todos los numeros");
			System.out.println("4: Buscar por nombre");
			System.out.println("5: Salir");
			
			opcion=s.nextInt();
			
			switch (opcion)
			{
				case 1:
					int pos;
					String nombre;
					int numero;
					System.out.println("Ingrese la posicion: ");
					pos=s.nextInt();
					System.out.println("Ingrese el nombre: ");
					nombre=s.next();
					System.out.println("Ingrese el numero: ");
					numero=s.nextInt();
					nombres[pos]=nombre;
					telefonos[pos]=numero;
					break;
				case 2:
					int pos2;
					System.out.println("Ingrese la poscion: ");
					pos2 = s.nextInt();
					System.out.println(nombres[pos2]+" - "+telefonos[pos2]);
					break;
				case 3:
					for(int i=0; i<nombres.length; i++)
					{
						System.out.println(nombres[i]+" - "+telefonos[i]);
					}
					break;
				case 4:
					String nombre_capturado;
					System.out.print("Ingrese el nombre: ");
					nombre_capturado=s.next();
					for(int i=0; i< nombres.length; i++)
					{
						if(nombre_capturado.equals(nombres[i]))
						{
							System.out.println("Numero: "+telefonos[i]);
						}
					}
					break;
				case 5:
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opcion invalida");
					break;
			}
		}while(opcion != 5);
		
		
		
		
//		for(int i = 0; i<nombres.length; i++)
//		{
//			System.out.print("Ingrese el nombre "+i+":");
//			nombres[i] = s.next();
//			System.out.print("Ingrese el telefono "+i+":");
//			telefonos[i] = s.nextInt();
//		}
//		
//		for(int i = 0; i<nombres.length; i++)
//		{
//			System.out.println(nombres[i]+" - "+telefonos[i]);
//		}
//		
//		int pos = 0;
//		while(pos<nombres.length)
//		{
//			System.out.print("Ingrese la posicion de la agenda: ");
//			pos = s.nextInt();
//			System.out.println(nombres[pos]+" - "+telefonos[pos]);
//		}
	}

}