package tema6;

public class ArrayCadenas {
	
	
	//inicializando Arrays
	 static String  cad1[]=new String [3];
	 static String cad2[]=new String [3];
	 static String cad3[]=new String[3];
	static void creaCadenas() {
		cad1[0]= "aepe";
		cad1[1]="pna";
		cad1[2]="carlos";
		cad2[0]="Cristina";
		cad2[1]="Monica";
		cad2[2]="Estefania";
	}
	
	
	static void ordenaCadenas() {
		for (int j=cad3.length-1;j>=0;j--) {
			for(int i=cad1.length-1;i>0;i--) {
				if(cad1[i].charAt(0)>cad1[i-1].charAt(0)) {
					cad3[j]=cad1[i];
				}else {
					cad3[j]=cad1[i-1];
				}
			}
		
		}
		for (String a: cad3) {
			System.out.print(a+" ");
		}
	}//fin de ordenaCadenas
	
	
	
} // fin array cadenas
