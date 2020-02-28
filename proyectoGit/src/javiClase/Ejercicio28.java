package javiClase;
import java.util.Scanner;
public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.printf("Degrees \tRadians \tSine \tCosine \tTangente");
		System.out.printf("30\t\t  %f\t\t %f\t\t  %f\t\t %f\t\t", Math.toRadians(30),Math.asin(30),Math.acos(30),Math.atan(30));
	}

}
