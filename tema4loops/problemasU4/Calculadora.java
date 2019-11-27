package problemasU4;
import java.util.Scanner;
public class Calculadora {

	public static void main (String[] args) {
		Scanner entrada=new Scanner(System.in);
		Menu mn=new Menu();
		System.out.println("#####CALCULADORA 100TIFICA######");
		System.out.println("1. Calcula numeros primos entre dos positivos dados");
		System.out.println("2. Calcula x de la ecuacion 4x+3=0");
		int opciones;
		opciones=entrada.nextInt();
		switch (opciones) {
		
		case 1: mn.consultaPrimos();
		case 2: mn.calculaX();
			 
		
		}
		
	}
}
