import java.util.Scanner;

public class Ibm

{

	public static void main(String[] args)
	
{
double peso;	
double altura;	
double IBM;	
	
	
Scanner entrada=new Scanner(System.in);
		
System.out.println("Introduzca su altura en cm");
	altura=entrada.nextDouble();
	
System.out.println("Introduzca su peso en kilos");
	peso=entrada.nextDouble();


//System.out.printf("IBM=" ((%f)/(%f/100)*(%f/100),peso, altura, altura); 	

System.out.print("IBM="((peso)/((altura/100.0)*(altura/100.0))));
	
System.out.printf("Su IBM es %d%n ", IBM);
	//da mal la cuenta porque no hace bien la division, necesita double o float	
}

}