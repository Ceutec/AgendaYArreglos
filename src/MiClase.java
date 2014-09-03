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
		while(opcion != 3)
		{
			System.out.println("Menu");
			System.out.println("1: Ingresar un numero");
			System.out.println("2: Leer un numero");
			System.out.println("3: Salir");
			
			opcion=s.nextInt();
			
			if(opcion == 1)
			{
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
			}
			if(opcion == 2)
			{
				int pos;
				System.out.println("Ingrese la poscion: ");
				pos = s.nextInt();
				System.out.println(nombres[pos]+" - "+telefonos[pos]);
			}
		}
		
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