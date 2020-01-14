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
public void ej2Bis() {
	int sumaFila=0,sumaColumna=0; // sumaTotal=0; esta variable no la resuelvo bien
	int [] [] matriz= new int [4][5];
	for (int fila=0; fila<matriz.length;fila++) {
		sumaFila=0;
		for (int columna=0;columna < matriz[0].length; columna++) {
			if (columna==matriz[0].length-1) {
				matriz[fila][columna]=sumaFila;
			}else{
				
				matriz[fila][columna]=(int)(Math.random()*4);
				sumaFila+=matriz[fila][columna];
				//sumaTotal+=matriz[fila][columna]; esto no lo coge bien
			}
		}
	}// fin del recorrido para rellenar la matriz
	for (int columna=0;columna<matriz[0].length;columna++) {
		sumaColumna=0;
		for (int fila=0; fila<matriz.length;fila++) {
			if(fila==matriz.length-1) {
				matriz[fila][columna]=(sumaColumna);
				if(columna==matriz[0].length-1) {
					matriz[fila][columna]=(sumaColumna*2); // aqui si pongo sumaFila o columna *2 da bien, si por el contrario, 
															// las sumo da error
				}
			}else {
				sumaColumna+=matriz[fila][columna];
			}
		}
	}
	
	
	for (int i=0; i<matriz.length;i++) {
		for (int j=0;j<matriz[0].length;j++) {
			System.out.printf("%7d", matriz[i][j]);
		}System.out.println();
	}// fin de imprimir matriz
} // fin del ejercicio 2 Bis

public void ej4()	
		throws InterruptedException  {
	
/*Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.*/
	
	
	int [] [] matriz4= new int [4] [5];
	int sumaDerecha=0, sumaColumna=0, sumaTotal=0;
	for (int fila=0; fila<matriz4.length;fila++) {
		sumaDerecha=0;
		for (int columna=0;columna<matriz4[0].length;columna++) {
			if(columna<matriz4[0].length-1) {
				matriz4[fila][columna]=(int)(Math.random()*4);
				sumaDerecha+=matriz4[fila][columna];
				sumaTotal+=matriz4[fila][columna];
			}else {
				matriz4[fila][columna]=sumaDerecha;
				//sumaTotal+=matriz4[fila][columna];
			} //fin else 
		}//fin del for columnas dentro de filas
	}// fin del for filas para rellenar la matriz
	for( int columna=0;columna<matriz4[0].length;columna++) {
		sumaColumna=0;
		for(int fila=0;fila<matriz4.length;fila++) {
			if(fila<matriz4.length-1) {
				sumaColumna+=matriz4[fila][columna];
				sumaTotal+=matriz4[fila][columna];
			}else {
				if(columna==matriz4[0].length-1) {
					matriz4[fila][columna]=sumaColumna*2;
				}else {
				matriz4[fila][columna]=sumaColumna;
				}
			}
		}// fin condicion para sumar solo la columna correspondiente
			 //
				
			//}
				
			
		//fin for fila 2 buccle anidado
	}//fin for columna 2 bucle anidado
	
	for (int fila=0; fila<matriz4.length;fila++) {
		
		for (int columna=0;columna<matriz4[0].length;columna++) {
			System.out.printf("%7d", matriz4[fila][columna]);
			Thread.sleep(200);
		}System.out.println();
		Thread.sleep(500);
	}
	
}// fin del ejercicio 4


public void ej5() {
		/*Ejercicio 5
		Realiza un programa que rellene un array de 6 filas por 10 columnas con
		números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
		A continuación, el programa deberá dar la posición tanto del máximo como
		del mínimo.*/
		
		int [] [] matriz = new int [6][10];
		int maximo=0, min=1000,posicionMax=0, posicionMin=0,posicionMinFin=0,posicionFinMax=0;
		for (int fila=0; fila<matriz.length;fila++) {
			for(int columna=0;columna<matriz[0].length;columna++) {
				matriz[fila][columna]=(int)(Math.random()*1001);
				if(matriz[fila][columna]>maximo) {
					maximo=matriz[fila][columna];
					
				}
				if(matriz[fila][columna]<min) {
					min=matriz[fila][columna];
					
				}
			}
			
		} // fin del for para rellenar y saber max y minimo
		for (int fila=0; fila<matriz.length;fila++) {
			for(int columna=0;columna<matriz[0].length;columna++) {
				System.out.printf("%5d" ,matriz[fila][columna]);
				if(matriz[fila][columna]!=maximo) {
					posicionMax++;
				}else {
					 posicionFinMax=posicionMax;
				}
				if(matriz[fila][columna]!=min) {
					posicionMin++;
				}else {
					 posicionMinFin=posicionMin;
				}
			}System.out.println();
		}
		System.out.println(min+" Posicion del minimo "+(posicionMinFin+1));
		System.out.println(maximo+" Posicion del maximo "+(posicionFinMax+1 ));
		
	}// fin ejercicio 5

	
	public void ej6() { //inacabado
	/*Modifica el programa anterior de tal forma que no se repita ningún número en
	el array.*/
	int [] [] matriz = new int [6][10];
	int maximo=0, min=1000,posicionMax=0, posicionMin=0,posicionMinFin=0,posicionFinMax=0;
	for (int fila=0; fila<matriz.length;fila++) {
		for(int columna=0;columna<matriz[0].length;columna++) {
			matriz[fila][columna]=(int)(Math.random()*10);
			int numNoRepe=matriz[fila][columna];
			
				for (int i=0; i<matriz.length;i++) {
				
					for (int j=0;j<matriz[0].length;j++) {
						while(numNoRepe==matriz[i][j]) {
							matriz[fila][columna]=(int)(Math.random()*51);
						}
				}
			}
			
			
			
			if(matriz[fila][columna]>maximo) {
				maximo=matriz[fila][columna];
				
			}
			if(matriz[fila][columna]<min) {
				min=matriz[fila][columna];
				
			}
		}
		
	} // fin del for para rellenar y saber max y minimo
	for (int fila=0; fila<matriz.length;fila++) {
		for(int columna=0;columna<matriz[0].length;columna++) {
			System.out.printf("%5d" ,matriz[fila][columna]);
			if(matriz[fila][columna]!=maximo) {
				posicionMax++;
			}else {
				 posicionFinMax=posicionMax;
			}
			if(matriz[fila][columna]!=min) {
				posicionMin++;
			}else {
				 posicionMinFin=posicionMin;
			}
		}System.out.println();
	}
	System.out.println(min+" Posicion del minimo "+(posicionMinFin+1));
	System.out.println(maximo+" Posicion del maximo "+(posicionFinMax+1 ));
	
}// fin ej6

public void ej7() { //INACABADO
	/* Mejora el ejercicio de la busqeda del tesoro de tal manera que si el tesoro esta a una casilla de distancia
	 * 	te lo diga un aviso "CUIDADO EL TESORO ESTA CERCA"
	 */
	
	 final int VACIO = 0;
	 final int MINA = 1;
	 final int TESORO = 2;
	 final int INTENTO = 3;
	
	int [][] cuadrante= new int [5][4];
	int x=0, y=0;
	for (int i=0; i<cuadrante.length;i++){
		for (int j=0; j<cuadrante[0].length;j++) {
			cuadrante[i][j]=VACIO;
		}
	}
	// COLOCANDO LA MINA
			int minaX=(int)(Math.random()*cuadrante.length);
			int minaY=(int)(Math.random()*cuadrante[0].length);
			cuadrante [minaX][minaY]=MINA;
			
	//COLOCANDO EL TESORO (NO PUEDE COINCIDIR CON LA MINA!!)
			int tesoroX, tesoroY;
			do {
				tesoroX=(int)(Math.random()*cuadrante.length);
				tesoroY=(int)(Math.random()*cuadrante[0].length);
			}while(tesoroX==minaX && tesoroY==minaY);
			cuadrante[tesoroX][tesoroY]=TESORO;
			
			
		//comienza el juego
		System.out.println("Que empiece la busqueda");
		int oportunidades=6;
		int salir=0;
		do {
			for (int i=0;i<cuadrante.length;i++) {
				for(int j=0; j< cuadrante[0].length;j++) {
					System.out.print("   |");
					if(cuadrante[i][j]==VACIO) {
						System.out.print("X");
					}else {
						System.out.print(" ");
					}
				} System.out.println();
			}
			System.out.println("Coordenadas X");
		int	 i=e.nextInt();
			
			System.out.println("Coordenadas Y");
		int	 j=e.nextInt();
			
		}while(salir!=1);
}// fin ejercicio7



	
} //fin de la calse principal






