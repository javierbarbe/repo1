
import java.util.Scanner;
public class Digitos12{
	public static void main (String[] args){
		
		Scanner entrada=new Scanner(System.in);
		int a,u,d,c,m,um;
				
		System.out.println("Introduce un numero de 5 digitos");
		a=entrada.nextInt();
		
		u=a%10;
		d=a/10%10;
		c=a/100%10;
		m=a/1000%10;
		um=a/10000%10;
	
		if((a>99999) || (a<(-99999)))
		System.out.println("Introduzca un numero de 5 digitos");
		
		else 
		System.out.printf("%d    %d      %d      %d       %d", u,d ,c ,m, um);
		
		
		
	}
}
