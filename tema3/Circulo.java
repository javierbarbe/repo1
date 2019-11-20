package cocheClasePaquete;

public class Circulo {

	//atributos
	int radio=2;
	
	private double area;
	
	public Circulo() {}
	
	public Circulo(int radio) {
		this.radio=radio;
	}
	
	public double area() {
		area=radio*radio*Math.PI;
		return area;
	}
	
}
