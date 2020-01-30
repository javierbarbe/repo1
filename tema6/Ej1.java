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
	
	
	public void abecedario(String pala) {
		/*metodo que te diga cuantas veces se repite cada
		 * letra en tu String
		 */
		
		char abecedario []= new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	pala.toLowerCase();
	for (int i=0;i<pala.length();i++) {
		int cuentaLetra=0;
		letra=pala.charAt(i);
		for(int j=0;j<abecedario.length;j++) {
			if(abecedario[j]==pala.charAt(i)) {
				cuentaLetra++;
				System.out.println("De la letra "+ abecedario[j]+ " hay "+cuentaLetra);
			}
		}
		
	}
	
	
	}
}