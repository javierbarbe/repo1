import java.util.Scanner;
public class Circunferencia
{
	public static void main(String [] args)
		{
				Scanner entrada= new Scanner(System.in);
				double radio;
				double area;
				double perimetro;
				double diametro;
				double pi=3.14159; 
				
				
			
				System.out.print("Introduzca el radio en numeros enteros de la circunferencia ");
				radio= entrada.nextDouble();
			
			perimetro=2*Math.PI*radio;// si quiero usar una biblioteca API metele directamente en el calculo 2*Math.PI*radio
			area=pi*radio*radio;
			diametro=2*radio;
			
			System.out.printf("El valor del perimetro es %f%n", perimetro);
			System.out.printf("El valor del area es %f%n El valor del diametro es %f%n", area, diametro);
			
			
			
			
		}
	
	
	}

