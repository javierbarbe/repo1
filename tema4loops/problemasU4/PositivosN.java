package problemasU4;
import java.util.Scanner;
public class PositivosN {
double num, negativos,positivos;
int total=0;
	public PositivosN() 
	{
	 Scanner entrada=new Scanner(System.in);
	while (total<10) 
		{
			System.out.println("Introduce un numero");
			this.num=entrada.nextDouble();
		if(this.num<0) {
			this.negativos++;
				} else {
			this.positivos++;
						} total++;
		} 
	System.out.println("Son positivos " + this.positivos + " . Son negativos "+ this.negativos);
	}

}