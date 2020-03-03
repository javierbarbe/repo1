

import java.util.Scanner;

public class trianguloEqui{
public static void main(String[] args){

double lado;
double area;
double  volumen;
double h;

	Scanner entrada= new Scanner(System.in);
	
	System.out.println("Para calcular area y volumen de un triangulo equilatero\n introduzca longitud en cm");
	lado=entrada.nextDouble();
	
	h = Math.sqrt((lado*lado)-((lado/2)*(lado/2)));
	area=lado*h/2;
	volumen=area*lado*3;
	System.out.printf("El area es %f%n El volumen es %f%n", area, volumen);
}
						
}



