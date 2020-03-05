package tema6;

public class MetodoBurbuja {

	int [] burbu = new int [5];
	int [] ordenada= new int [burbu.length];
	
	public int [] MetodoBurbuja() {
		for (int i= 0; i<burbu.length;i++) {
			burbu[i]=(int)(Math.random()*10);
			
		}
		return burbu;
	}
	
	public int [] ordenaArray(int [] recibido) {
		int aux;
		for(int i=0; i<recibido.length; i++) {
			for (int j=0;j<recibido.length;j++) {
				if(i!=j) {
					aux=recibido[j];
					if (recibido[i]<recibido[j]) {
						recibido[j]=recibido[i];
						recibido [i]=aux;
					}
				}
			}
		}
		
		
		return ordenada;
	}
	
	public int [] ordenaArray2(int [] recibido) {
		int aux;
		for(int i=0; i<recibido.length; i++) {
			for (int j=0;j<recibido.length-1;j++) {
				
					if (recibido[i]>recibido[j]) {
						aux = recibido[i];
						recibido[j]=recibido[i];
						recibido [i]=aux;
					}
				}
			}
				
		
		return ordenada;
	}
	public void imprimeArray(int [] recibido) {
		for (int i=0;i<recibido.length;i++) {
			System.out.print(recibido[i]+"  ");
		}
		
	}
}
