import java.util.Scanner;
public class Ejercicio9
{
	public static void main(String[] args)
	{
	 //una app que lea dos enteros y determine si el primero es multiplo del segundo e imprima resultado. utilice residuo
	Scanner ent=new Scanner(System.in);
	int a;
	int b;
	
	System.out.println("Introduzca un entero");
		a=ent.nextInt();
		
	System.out.println("Introduzca otro entero");
		b=ent.nextInt();
	
	if(a%b==0)
		System.out.printf("El primer numero es multiplo del segundo \n");
		
	else
	 System.out.println("No son multiplos");
	
	}
}
