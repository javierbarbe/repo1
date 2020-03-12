package tema7arraysFunciones;

public class PruebaConcatena  {

	public static void main(String[] args) {

		Concatena pe = new Concatena();
		double [] prime = pe.inicializa(2);
		double [] secu = pe.inicializa(1);
		pe.imprimeDoubleArr(pe.mezcla(prime, secu));
		
	}

}
