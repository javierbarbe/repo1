package tema7.POO;

public class Gato {
	private String color="",sexo="",nombre="";
	public Gato(String color, String sexo,String nombre) {
		this.color=color;
		this.sexo=sexo;
		this.nombre=nombre;
	}
	public Gato() {
		
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	protected String getSexo() {
		return sexo;
	}
	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
