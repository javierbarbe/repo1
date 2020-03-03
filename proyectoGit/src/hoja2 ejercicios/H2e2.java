import java.util.Scanner;
public class H2e2
{
	public static void main(String[] args)
	{
		Scanner entrada= new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Escriba un numero entero ");
		numero1= entrada.nextInt();
		System.out.println("Escriba otro numero entero ");
		numero2= entrada.nextInt();
		
		if(numero1==numero2);
		System.out.printf("Estos numeros son iguales %n");
		if(numero1>numero2);
		System.out.printf("El primer numero es mayor al segundo %n");
		if(numero2>numero1); 
		System.out.printf("El segundo numero es mayor al primero %d > %d%n", numero2, numero1);//error al imprimir con if
		
		

}
}
