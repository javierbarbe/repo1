import java.util.Scanner;
public class ejer11 
{
	public static void main (String[] args){
		
		Scanner entrada= new Scanner(System.in);
		int a,b,c,d;
		double0 distancia;
		System.out.println("Introduce un puntos mediante coordenadas cartesianas (x,y)");
		a=entrada.nextInt();
		b=entrada.nextInt();
		System.out.println("Introduce otro punto mediante coordenadas cartesianas (x,y)");
		c=entrada.nextInt();
		d=entrada.nextInt();
		
		distancia=(Math.sqrt(Math.pow((c - a),2) + Math.pow((d-b),2)));
		
		System.out.printf("Distancia= %f", distancia);
		
		}
	}
