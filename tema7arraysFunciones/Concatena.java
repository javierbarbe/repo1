package tema7arraysFunciones;
import tema7.*;

public class Concatena {
double [] primer;
double [] segundo;

		public Concatena() {
			
		}
		public double [] mezcla (double [] primer, double [] segundo) {
			double [] mezclado = new double [primer.length+segundo.length];
			this.primer=primer;
			this.segundo=segundo;
			primer = inicializa(primer.length);
			segundo= inicializa(segundo.length);
			int j=0;int k=0;
			for (int i=0;i<mezclado.length;i++) {
				if (i%2==0 && j<primer.length) {
				mezclado[i]=primer[j];
				j++;
				}
				if ( i%2==1 &&  k>=segundo.length){
					if(k==segundo.length) {
					i++;
					mezclado[i]=primer[k];
					k++;
					i--;}
					else {
						mezclado[i]=primer[k];
						k++;
					}
				}
				if (i%2==1 && k<=segundo.length) {
					mezclado[i]=segundo[k];
					k++;
				
				}	if ( i%2==0 &&  j>=primer.length){
					if(j==primer.length) {
					i++;
					mezclado[i]=segundo[j];
					j++;
					i--;}
					else {
						mezclado[i]=segundo[j];
						j++;
					}
				}
				
			
			}
			return mezclado;
		}
		
		public double [] inicializa (int tamanio) {
			double [] inicializado = new double [tamanio] ;
			for (int i=0; i< inicializado.length;i++) {
				inicializado[i]= (int)(Math.random()*55);
			}
			return inicializado ;
		}
		
		public void imprimeDoubleArr( double [] recibido) {
			for (int i=0;i<recibido.length;i++) {
				System.out.print(" "+recibido[i]);
			}
			
			
		}
}
