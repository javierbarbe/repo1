import java.util.Scanner;
public class Distancia{
	public static void main(String[] args)
	{
		
		Scanner entrada=new Scanner(System.in);
		double conversion;
		double dist;
		
		System.out.println("Introduce distancia en Km");
		dist=entrada.nextDouble();
		
		conversion=(dist*0.6);
		
		System.out.printf("La distancia en millas: %f millas %n", conversion);
		
		}
	}
