package problemasU4;
import java.util.Scanner;
public class Menu {

	public Menu(){
		
	}
	public void calculaX() {
		double x;
		System.out.println("sea a=4 y b=3");
		float a=4f, b=-3f;
		x=(b/a);
		System.out.println(x);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public void consultaPrimos() {
		Scanner entrada=new Scanner(System.in);
		int num1, num2,count=0;
		System.out.println("Introduce el primer numero entero");
		num1=entrada.nextInt();
		System.out.println("Introduce el segundo numero entero");
		num2=entrada.nextInt();
		if (num1>0 && num2>0 && num1<num2) 
		{
			for (int a=num1; a<=num2; a++) 
			{
				System.out.println(a);
				for (int t=1;t<=a; a++) 
				{
					if(	a%t==0) 
					{
					count++;
					}
					if (count<=2) 
					{
						System.out.print(a+ " es un numero primo ");
					}
			}
		}
	}else {
		System.out.println("introduzca positivos parfavar");
	}
}
}
