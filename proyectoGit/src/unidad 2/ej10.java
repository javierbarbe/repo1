
 /*   Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura 
  * Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen
  *  cuenta el 40% y la del segundo examen un 60%.

Ejemplo 1:

Introduce la nota del primer examen: 7
¿Qué nota quieres sacar en el trimestre? 8.5
Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.

Ejemplo 2:

Introduce la nota del primer examen: 8
¿Qué nota quieres sacar en el trimestre? 7
Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen
*/
import java.util.Scanner;
public class ej10{
	public static void main(String[] args){
		
	Scanner entrada=new Scanner(System.in);
	
	double nota1, nota2, media, nota1porc,  mediadoble;
	
	System.out.println("Introduce la nota del primer examen");
		nota1=entrada.nextDouble();
		
		System.out.println("¿Qué nota quieres sacar en el trimestre?");
		media=entrada.nextDouble();
		
		mediadoble=2*media;
		nota1porc = nota1 * 0.4;
		nota2=((media)-(nota1*0.4))/0.6; 
		
		System.out.printf("Para tener un %f en el trimestre necesitas un %f en el segundo examen", media, nota2);
		
		
		
		
		}
	
	}
