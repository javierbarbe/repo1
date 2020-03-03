import java.util.Scanner;

public class area
{
	public static void main(String[] args)
	{
	 Scanner entrada= new Scanner(System.in);
		 
		 double h, h2, perimetro, superf, lado, lado2,ladomedi,q;
	 
	 System.out.println("introduzca el lado");
	 lado=entrada.nextDouble();
	 
	 ladomedi=(lado/2)*(lado/2);
	 lado2=lado*lado;
	 q=Math.sqrt ((lado2)-(ladomedi));
	 h= Math.sqrt(((lado)*(lado))-((1/2*lado)*(1/2*lado))); 
	// h2=Math.sqrt(h); //raiz
	  superf=(lado*q)/2;
	 perimetro=lado*3;
	 System.out.printf("Area: %f%nPerimetro: %f%nAltura: %f%nq:%f%n", superf, perimetro, h, q);
	}
}
