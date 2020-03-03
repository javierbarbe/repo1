import java.util.Scanner;
public class Comparaciones2
{
	public static void main(String [] args)
	{
	Scanner comparacion= new Scanner(System.in);
	int primero;
	int segundo;
	int tercero;
	int suma;
	int producto;
	double promedio;
	
	System.out.print("Introduzca el primer numero");
	primero= comparacion.nextInt();
	
	System.out.print("Introduzca el segundo numero");
	segundo= comparacion.nextInt();
	
	System.out.print("Introduzca el tercer numero");
	tercero=comparacion.nextInt();
	
	suma=primero+segundo+tercero;
	producto=primero*segundo*tercero;
	promedio=(primero+segundo+tercero)/3;
	
	if (primero>segundo)
		System.out.printf("%d", primero);
	if(segundo>tercero)
		System.out.printf("%d", segundo);
	if (primero==segundo)
		System.out.println(+primero,"=" ,+segundo);
	}
}
