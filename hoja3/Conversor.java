import java.util.Scanner;

public class Conversor{
public  static void  main(String[] args) {
	
	Scanner entrada= new Scanner(System.in);
	int temp;
	float t1;
	float t2; 
	
	System.out.println("Si quieres pasar de C a F, pulsa 1\n Si quieres pasar de F a C pulsa 2");
	temp=entrada.nextInt();
	
	if(temp == 2)	{
											//    (f-32)5/9=c // f=(9*c/5)+32
		System.out.printf("La temperatura será mostrada en ºC \n"); 
		System.out.println("Introduzca su temperatura");
		t1=entrada.nextFloat();
		System.out.printf("La temperatura en ºC es %f%n ",(t1-32)*5/9);
 	}
 	
 
	if(temp == 1){
											// c=5/9*f*32
		System.out.printf("La temperatura será mostrada en ºF \n"); 
		
		System.out.println("Introduzca su temperatura");
		t2=entrada.nextFloat();
		System.out.printf("La temperatura en ºF es %f%n ",(t2*9/5)+32);
 	}
 	}

}
