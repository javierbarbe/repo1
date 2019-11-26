package problemasU4;
import java.util.Scanner;
public class Factorial {
	long num,numero, factorial=1;
	
	
	public Factorial() 
	{
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce un n para hacer el factorial");
		this.numero=entrada.nextLong();
		this.num=this.numero;
		if (this.numero==0){
			System.out.println("factorial = 1");
		} else 	{ 
			while(this.numero !=0) 
			{
				this.factorial*=this.numero;
				this.numero--;
			} System.out.println(num+ "! = "+this.factorial);
				}
	}
	
	public  Factorial(long numero) {
	this.numero=7;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public long getFactorial() {
		return factorial;
	}

	public void setFactorial(long factorial) {
		this.factorial = factorial;
	}
	
}
