package hoja3;

import java.util.Scanner;
public class EjercicioNotas
{
	public static void main(String[] args)
	{
		Scanner entrada= new Scanner(System.in);
		
		float nota;
		
		System.out.print("Introduzca su nota ");
		nota=entrada.nextFloat();
		
		if(nota<5)
			System.out.println("SUSPENSO");
		
		if((nota>=5)&&(nota<6))
			System.out.println("SUFICIENTE");
			
		if((nota<7 ) && (nota>=6))
			System.out.println("BIEN");
			
		if((nota<9)&&(nota>=7))
			System.out.println("NOTABLE");
	
		if((nota>=9)&&(nota<10))
			System.out.println("SOBRESALIENTE");
		
		if(nota==10)
			System.out.println("MATRICULA DE HONOR");
	
	
	}
}
