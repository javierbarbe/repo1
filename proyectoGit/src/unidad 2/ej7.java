import java.util.Scanner;

public class ej7{
public static void main(String[] args){

	Scanner entrada=new Scanner(System.in);
	float byt, kB,mB,gB,tB;
	int opcion;
	
	System.out.println("Elija unidad:\n byte -0\n kylobyte-1\n megabyte-2\n gigabyte-3\n terabyte-4\n");
	
	opcion=entrada.nextInt();
	switch (opcion){
		case 0:System.out.println("Introduzca bytes");// De Byte a kb, mb, gb, tb");
				byt=entrada.nextFloat();
				System.out.printf("en kb %f%nen mB %f%nen gB %f%nen tB %f%n", byt/1024 , byt/Math.pow(1024,2), byt/Math.pow(1024,3), byt/Math.pow(1024,4));
		break;
		case 1:System.out.println("Introduzca kB");
				kB=entrada.nextFloat();
				System.out.printf("en b %f%nen mB %f%nen gB %f%nen tB %f%n", kB*1024, kB/1024, kB/1024/1024, kB/1024/1024/1024);
		break;
		case 2: System.out.println("Introduzca mB");
				mB=entrada.nextFloat();
				System.out.printf("en b %f%nen kB %f%nen gB %f%nen tB %f%n", mB*1024*1024, mB*1024, mB/1024, mB/Math.pow(1024,2));
		break;
		case 3: System.out.println("Introduzca gB");
				gB=entrada.nextFloat();
				System.out.printf("en b %f%nen kB %f%nen mB %f%nen tB %f%n", gB*Math.pow(1024,3), gB*Math.pow(1024,2), gB*1024, gB/1024);				
		break;
		case 4: System.out.println("Introduzca tB");
				tB=entrada.nextFloat();
				System.out.printf("en b %f%nen kB %f%nen mB %f%nen gB %f%n", tB*Math.pow(1024,4), tB*Math.pow(1024,3), tB*1024*1024, tB*1024);	
		break;
	default:System.out.println("...opcion incorrecta...");
		
		
		}
}
}
