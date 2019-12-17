package ejerciciosLibro200;

import java.util.Scanner;

public class Ej1 {
	
	Scanner e  = new Scanner(System.in);
		 int p;
	public void array11() {
	int [] num= new int [12];
	
	num[0]=39;
	num[1]=-2;
	num[6]=14;
	num[8]=5;
	num[9]=120;
	
	for (int n: num) {
		System.out.print(n+" ");
	}
	
	}
public void  arrayCaract() {
	char [] simbolos= new char [19];
	simbolos[0]=')';
	simbolos[1]='x';
	simbolos[4]='@';
	simbolos[6]=' ';
	simbolos[8]='+';
	simbolos[9]='Q';
	
	
	for (char p : simbolos) {
			System.out.print(p+ " ");
}
	
}	


public void albertito() {
	int i;
	int [] alberto = new int [9];
	
	for( i=8; i>=0; i--) {
		System.out.println("Introduce un nmero");
		alberto [i]= e.nextInt();
		
		System.out.println(alberto[i]);
	}
	 for( int n: alberto) {
		 System.out.print(n+" ");
	 }
	/*System.out.print(alberto[2]);
	
	System.out.print(alberto[1]);
	System.out.print(alberto[0]);*/
	 
	 
		 
	 }

public void ej4() {
	
	int[] numero= new int [20];
	double[] cuadrado= new double [20];
	double [] cubo= new double [20];
	
	for (int i=0; i<numero.length; i++) {
		numero[i]= (int) (Math.random()*101);
		cuadrado[i]= numero[i]*numero[i];
		cubo[i]=numero[i]*numero[i]* numero[i];
		
		
	}	 for (int t=0;t<numero.length;t++) {
		 System.out.printf("%4d   %.0f  %6.0f \n", numero[t],cuadrado[t], cubo[t]);
	/*for (int n:numero) {
		System.out.print(n+" ");
	}*/


	 }
}
	 

}


