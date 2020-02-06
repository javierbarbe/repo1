package tema6;

public class Ej1 {
	/*crea una clase que cuente el numero de vocales introducidas en una cadena de textoç
	 * por teclado, independientemente de que sean mayusculas, minusculas o tengan acento
	 */
 //atributos
	String palabra;
	char letra;
	int numVocales=0;
	char vocales []= new char []{'a','e','i','o','u','A','E','I','O','U','Á','É','Í','Ó','Ú','á','é','í','ó','ú'};
	
	public Ej1(String palabra) {
		this.palabra=palabra;
		for(int i=0;i<palabra.length();i++) {
			letra=palabra.charAt(i);
			for(int j=0;j<vocales.length;j++) {
				if(letra==vocales[j]) {
					numVocales++;
				}
			}
			
		} System.out.println("Tu palabra tiene "+ numVocales+ " vocales" );
	}
	
	public void conteoJuanma(String pala) {
	int contador []= new int [27];
	
		for (int i=0;i<pala.length();i++) {
			char letra=pala.charAt(i);

			for (int j=0;j<abecedario.length;j++) {
				if(letra==abecedario[j]) {
					contador[j]++;
				}
			}
		}
		 for (int q=0;q<abecedario.length;q++) {
			 if(contador[q]!=0) {
			 System.out.println("de la letra "+abecedario[q]+" hay "+contador[q]);
			 }
		 }
		}


	public void abecedario(String pala) {
		/*metodo que te diga cuantas veces se repite cada
		 * letra en tu String
		 */
		
		char almacen[]=new char[15];
		char abecedario []= new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	//int letrasFinales=0;
	pala.toLowerCase();
	for (int i=0;i<pala.length();i++) {
		//int cuentaLetra=0;
		letra=pala.charAt(i);
		for(int j=0;j<abecedario.length;j++) {
			if(abecedario[j]==pala.charAt(i)) {
				//int cambio=0;
				
				for (int p=0;p<almacen.length;p++) {
					almacen[i]=letra;				
			  }
				
			}
		}
		
	}
	
	for(int i=0;i<almacen.length;i++) {
		int cambio;
		int cuentaLetra=0;
		for(int j=0; j<almacen.length;j++) {
			cambio=0;
				if (cambio==0){
					 
					if(almacen[i]==almacen[j]) {
						cuentaLetra++;
						//letrasFinales++;
						cambio=1;
					}else {
						//almacen[i]=letra;
						//cuentaLetra++;
						cambio=1;
						//letrasFinales+=cuentaLetra;
					}
				}
		} System.out.println("de la letra " +almacen[i]+ " hay "+ cuentaLetra);
	}
	
	
	}// fin abecedario
	
	public class ArrayCadenas {

	public static String[] primero=new String[3];
	public static String[] segundo=new String[3];
	
	
	public static String[] tercero=new String[6];
	static String temp="";
	
	static void inicializaArrays(){
			primero[0]="Zarlos";
			primero[1]="Pepe";
			primero[2]="Ana";
			//return primero;
			segundo[0]="Monica";
			segundo[1]="Cristina";
			segundo[2]="Jose";
			
			
	}
	public static String[] ordenaArray(String[] array) {
		for(int j=0;j<array.length;j++) {
			for(int i=0;i<array.length-1;i++) {
				if(array[i].charAt(0)>array[i+1].charAt(0)) {
					//String[]aux=new String[3];
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		}
		
		return array;
	}
	
	public static String[] imprimeArray(String[] primero) {
		
		for (int i=0;i<primero.length;i++) {
			System.out.print(primero[i]+ " ");
		}return primero;
	}
	
	
	
	public static String[] sumaArrays() {
		for(int i=0;i<primero.length;i++) {
			
				tercero[i]=primero[i];
			
		}int p=3;	
		while (p<tercero.length) {
				for(int q=0;q<segundo.length;q++) {
					
						tercero[p]=segundo[q];
						p++;
			//
				}
		}
		return tercero;
	}
	
	
}
	
	
	
	
	
}
