import java.util.Scanner;

public class ParImpar
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);
		
		int num;
		System.out.println("Introduzca el numero");
		num=entrada.nextInt();
		
		if( num%2==0)
			System.out.printf( "el numero es par %n");
			
		else
			System.out.println("el numero es impar");
}
}
