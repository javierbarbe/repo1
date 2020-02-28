package herencia;

public class Jefatura extends Empleado {

	public Jefatura(String nombre,double sueldo, int agno, int mes, int dia ) {
		super(nombre, sueldo, agno,mes,dia);
	}
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	public double getSueldo(){
		double sueldoJefe=super.getSueldo();
		return sueldoJefe+incentivo;
	}
	
	private double incentivo;
		
	
}
