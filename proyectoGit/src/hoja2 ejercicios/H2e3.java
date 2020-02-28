import java.util.Scanner;
public class H2e3
{
	public static void main(String[] args)
	{
		Scanner entrada= new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		int suma;
		int multiplicacion;
		int media;
		
		
		
		System.out.println("Escriba un numero entero ");
		numero1= entrada.nextInt();
		System.out.println("Escriba otro numero entero ");
		numero2= entrada.nextInt();
		System.out.println("Escriba otro numero entero ");
		numero3= entrada.nextInt();
		
		multiplicacion= (numero1*numero2*numero3);
		media=(numero1+numero2+numero3)/3;
		suma=numero1+numero2+numero3;
		
		System.out.printf("La suma de los tres es %d%n", suma);
		System.out.printf("La multiplicacion de los tres es %d%n", multiplicacion);
		System.out.printf("La media de los tres es %d%n", media);
		
		
		if((numero1==numero2) && (numero2==numero3))
			System.out.printf("Estos numeros son iguales %n");
	    
	    if((numero1>numero2) && (numero1>numero3))
			System.out.printf("%d es el mayor %n", numero1);
		
		if((numero2>numero1) && (numero2>numero3))
			System.out.printf("%d es el mayor %n", numero2);
		
		if((numero3>numero1) && (numero3>numero2))
			System.out.printf("%d es el mayor%n", numero3);
			
		if((numero1<numero2) && (numero1<numero3))
			System.out.printf(" %d es el menor%n", numero1);
			
		if((numero2<numero3) && (numero2<numero1))
			System.out.printf("%d es el menor%n", numero2);
			
		if((numero3<numero2) && (numero3<numero1))
			System.out.printf("%d es el menor%n", numero3);
			
		if((numero1<numero2) && (numero1<numero3))
			System.out.printf("%d es el menor%n", numero1);
		
		

}
}
