package problemasU4;
import java.util.Scanner;


public class LetraL {
	
	//atributos 
	int altura;
 Scanner entrada=new Scanner(System.in);
	//public LetraL () {}

 public LetraL() {
	 System.out.println("Altura para la letra");
	 altura=entrada.nextInt();
	 for(int alt=1;alt<=altura-1;alt++) 
	 	{
		 System.out.println("*");
	 	}
	 for (int longi=1;longi<=(altura/2)+1;longi++) {
		 System.out.print("* ");}
	 }
 }
  
	
	

