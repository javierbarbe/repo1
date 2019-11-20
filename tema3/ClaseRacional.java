package cocheClasePaquete;

public class ClaseRacional {
	
	
						//atributos
	  int numerador;

	  int denominador;

	 public ClaseRacional() {} // construtor por defecto

	 public void ClaseRacional(int numerador, int denominador)

	  {
	    this.numerador = numerador;

	    if (denominador == 0) denominador = 1; // el denominador no puede ser cero

	    this.denominador = denominador;
	  }

	 

	 public  void visualizarRacional()

	  {
		 System.out.println(numerador + "/" + denominador);

	  }

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	 
}
	
	


