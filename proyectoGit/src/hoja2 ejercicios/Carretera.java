import java.util.Scanner;
public class Carretera
{
	public static void main(String[] args)
	{
	Scanner entrada=new Scanner(System.in);
	int peso;
	int altura;
	int IBM;
	
	
	System.out.println("Introduzca su altura en cm");
	altura=entrada.nextInt();
	
	System.out.println("Introduzca su peso en gramos");
	peso=entrada.nextInt();
	
	
	IBM=peso/(altura*altura);
	System.out.printf("Su IBM es %d%n ", IBM);
		}
}
