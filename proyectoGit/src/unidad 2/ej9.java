import java.util.Scanner;
public class ej9 {
	
	public static void main (String[] args) {
		double beneficio, ganancia, potencia, resto;
		int meses;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce una ganancia € al 3.75% anual");
		ganancia=entrada.nextDouble();
		potencia=(1+0.003125);
		System.out.println("Numero de meses");
		meses=entrada.nextInt();
		beneficio=ganancia*Math.pow(potencia,meses);
		resto=beneficio-ganancia;
		System.out.printf("obtengo un beneficio en %d meses de %f%n", meses, resto);
	}
	}

   /* (Ejercicio Financiero): Supón que tienes 100€ de beneficio mensual en una cuenta bancaria con un interés anual de 3.75%. El interés mensual sería: 0.0375/12 = 0.003125.

    Después del primer mes la ganancia sería: 100 + (0.003125 *100) = 100.3125
    Después del segundo mes sería de: (100.3125 + 100) * ( 1 + .003125) = 200.9384765625 //cn=co*(1+i)e`n

Realiza un programa que calcule y muestre por pantalla el beneficio de los 6 primeros meses. De entrada pide el beneficio mensual, ej 100€.
}
}*/

