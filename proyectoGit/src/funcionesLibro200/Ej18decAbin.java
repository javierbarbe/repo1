package funcionesLibro200;

public class Ej18decAbin {
	long decimal;
	String binario="";
	public  Ej18decAbin() {
		
	}
	
	public String aBinario(long numero) {
		
		long numdiv;
		while(numero>0) {
			binario +=numero%2;
			numdiv=numero/2;
			
			numero=numdiv;
		} 
		StringBuilder sb = new StringBuilder();
		sb.append (binario);
		sb.reverse();
		binario=sb.toString();
		return binario;
	}

	
	public long aDecimal(String binario) {
		int exponente=0;
		char a='1';
		char o='0';
		for (int i=0;i<binario.length();i++) {
			char valpos=binario.charAt(i);
			if (valpos==a || binario.charAt(i) ==o) {
				System.out.println("Bien...has introducdio en formato binario");
			}else {
				System.out.println(binario.charAt(i));
				System.out.println("por favor... introduce solo 0s y 1s");
				
			}
		}
		long nume=Long.valueOf(binario);
		while (nume>0) {
			long base=nume%2;
			if (base==1) {
				base++;
			}
			decimal+=(Math.pow(base, exponente));
			nume/=10;
			exponente++;
		}
		
		return decimal;
	}
	public long getDecimal() {
		return decimal;
	}

	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}

	
}
