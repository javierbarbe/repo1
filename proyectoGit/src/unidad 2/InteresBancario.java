/*     Vamos a crear un programa de gestión de préstamos en el que se solicitan los siguientes requisitos:

    El usuario debe introducir la tasa de interés, la cantidad total del préstamo y los años en los que los pagos de la deuda se realizan.
    Debe procesarse y mostrar el pago mensual y la cantidad total de los pagos.

El pago mensual y el total del pago se calculan con las siguientes fórmulas:

pagoMensual = ( totalPrestamo * tasaDeInteresMensual ) / (1 - 1 / ((1  + tasaDeInteresMensual ) ^ ( numAnyos x 12 )))

totalPago = pagoMensual * numAnyos * 12

    El interés debe ser un porcentaje 4.5% por ejemplo, si quieres obtener el interés mensual debes dividir por 100 y luego dividir por 12.
    Puedes utilizar las funciones Math que necesites.
*/

import java.util.Scanner;
public class InteresBancario {
	
	public static void main (String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		double tasaInteres, cantidadPrestamo, añosPago, pagoMensual, cantidadDePago,interesDado;
		
		
		
		
		System.out.println("Introduzca el interes anual");
		interesDado=entrada.nextDouble();
		tasaInteres= interesDado/100/12;
		System.out.println("Introduzca cantidad total del prestamo");
		cantidadPrestamo=entrada.nextDouble();
		System.out.println("Numero de años");
		añosPago=entrada.nextDouble();
		
		pagoMensual = (( cantidadPrestamo * tasaInteres ) / (1 - 1 / (Math.pow((1  + tasaInteres ),(añosPago*12 )))));
		cantidadDePago = pagoMensual * añosPago * 12;
		
		System.out.printf("El pago mensual es de %.2f%nEl pago total es de %f%n", pagoMensual,cantidadDePago);
		
		
		
	}
}

