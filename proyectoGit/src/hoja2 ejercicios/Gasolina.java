import java.util.Scanner;

public class Gasolina

{
		 
public static void main(String[] args)
	{
		Scanner vu= new Scanner(System.in);
			
			float distancia;
			float precio;//hay que dividir por 100 para pasar a euros
			float consumo;
			float coste; 
			
			System.out.println("Introduce distancia en kilometros");
			distancia=vu.nextFloat();
			
			System.out.println("Introduzca precio gasolina en €");
			precio=vu.nextFloat();
			
			System.out.println("Introduzca el consumo de su coche a los 100km en litros");
			consumo=vu.nextFloat();
			
			coste=((distancia/100)*((precio)*consumo));
			
			System.out.printf( " El precio del viaje es %f%n", coste);//PUTOS DATOS FLOAT!! %F no %d
			

	}
}
