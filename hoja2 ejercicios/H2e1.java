import java.util.Scanner; 

public class H2e1
{
public static void main(String[] args);
Locale.setDefault(Locale.Category.FORMAT, Locale.US);
	{
		
		Scanner entrada= new Scanner(System.in);// escriba 2  numeros
		float numero1;
		float numero2;
		float suma;
		float resta;
		float multiplicacion;
		float division;
		
		System.out.print("Introduzca el primer numero ");
		numero1= entrada.nextFloat();
		System.out.print("Introduzca el segundo numero ");
		numero2= entrada.nextFloat();
		
		multiplicacion= numero1*numero2;
		suma=numero1+numero2;
		resta=numero1-numero2;
		division=numero1/numero2;
		
		System.out.printf("La suma es %s%n", suma);
		System.out.printf("La resta es %s%n", resta );
		System.out.printf("La multiplicacion es %s%n", multiplicacion);
		System.out.printf("La division es %s%n", division);


	}
}
