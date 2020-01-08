package ejerciciosLibro200;
import java.util.*;
public class ArraysBiEjercicios {
Scanner e=new Scanner(System.in);
	
	public void ej1() {
		/*Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.*/
		
		int [] [] cuadro= new int[3][6];
		cuadro[0][0]=0;
		cuadro[0][1]=30;
		cuadro[0][2]=2;
		cuadro[0][5]=5;
		cuadro[1][0]=75;
		cuadro[2][2]=-2;
		cuadro[2][3]=9;
		cuadro[2][5]=11;
		System.out.print("\t\t Columna 0 \t Columna 1\t Columna 2\t Columna 3\t Columna 4\t Columna 5\t");
		System.out.println();
		System.out.println("\t\t_____________|______________|_______________|_______________|_______________|_______________|");
		
		System.out.println();
		System.out.print("Fila 0:");
		
		for (int i=0; i<cuadro.length;i++) {
			for(int j=0; j<cuadro[0].length;j++) {
				if(i==0) {
				System.out.printf("%15d ",cuadro[i][j]);
				}
			}
		}//fin del for primera linea
		
		System.out.println();
		System.out.println("\t\t_____________|______________|_______________|_______________|_______________|_______________|");
		System.out.println();
		System.out.print("Fila 1:");
		for (int i=0;i<cuadro.length;i++) {
			for(int j=0; j<cuadro[0].length;j++) {
				if(i==1) {
				System.out.printf("%15d ",cuadro[i][j]);
				}
			}
			
		}//fin de for fila 1
		System.out.println();
		System.out.println("\t\t_____________|______________|_______________|_______________|_______________|_______________|");
		System.out.println();
		System.out.print("Fila 2:");
		for (int i=0; i<cuadro.length;i++) {
			for(int j=0; j<cuadro[0].length;j++) {
				if(i==2) {
				System.out.printf("%15d ",cuadro[i][j]);
				}
			}
		}// fin del for fila 2
		System.out.println();
		System.out.println("\t\t_____________|______________|_______________|_______________|_______________|_______________|");
		
	}//fin ejercicio 1

	
	
	
	
public void ej2() {
	/*Escribe un programa que pida 20 números enteros. Estos números se deben
	introducir en un array de 4 filas por 5 columnas. El programa mostrará las
	sumas parciales de filas y columnas igual que si de una hoja de cálculo se
	tratara. La suma total debe aparecer en la esquina inferior derecha.*/
	System.out.println("ola");
	int po,i=0,j=0, sumaderecha=0,sumaderechaFINAL=0;
	int [] [] sumatorio = new int[5][6];
	//while(i<5)
			   {
	for ( i=0;i<sumatorio.length;i++) {
		//while(j<6) {
			for( j=0;j<sumatorio[0].length;j++) {
				sumaderecha=0;
					//System.out.println("introduce numero");
					//po=e.nextInt();
				
				if(j<5) {
					sumatorio[i][j]=(int)(Math.random()*25);
					 sumaderecha+=sumatorio[i][j];
					 sumaderechaFINAL+=sumatorio[i][j];
				}else {
							sumatorio[i][j]=sumaderechaFINAL;
							sumatorio[i][j]=sumaderecha;
					}
				}//fin de while j<5
				 //fin de while j<5;
	}//fin de for i=0
		;
	
	
	for ( i=0;i<sumatorio.length;i++) {
		for( j=0; j<sumatorio[0].length;j++) {
			if(i==0) {
				
			System.out.printf("%7d ",sumatorio[i][j]);
			}
			
		}
		
	}System.out.println();
	for ( i=0;i<sumatorio.length;i++) {
		for( j=0; j<sumatorio[0].length;j++) {
			if(i==1) {
			System.out.printf("%7d ",sumatorio[i][j]);
			}
			
		}
		
	}//fin imprimir fila 2(3);
	System.out.println();
	for ( i=0;i<sumatorio.length;i++) {
		for( j=0; j<sumatorio[0].length;j++) {
			if(i==2) {
			System.out.printf("%7d ",sumatorio[i][j]);
			}
		}
		
	}//fin imprimir fila 1(2);
	System.out.println();
	//System.out.println();
	//System.out.println();
	for ( i=0;i<sumatorio.length;i++) {
		for( j=0; j<sumatorio[0].length;j++) {
			if(i==3) {
			System.out.printf("%7d ",sumatorio[i][j]);
			}
		}
		
	}//fin imprimir fila 3(4);
	System.out.println();
}// fin EJERCICIO 2
	
	

			   }

}// fin de la clase
