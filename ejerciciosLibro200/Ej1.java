package arraysLibroJava200;

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
	
	for( i=8; i>0; i--) {
		System.out.println("Introduce un numero");
		alberto [i]= e.nextInt();
		
		
	}System.out.print(alberto[i]);
	
	
}

}
