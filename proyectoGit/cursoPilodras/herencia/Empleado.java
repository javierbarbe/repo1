package herencia;

import java.util.*;


public class Empleado {
	private final String nombre;
	private double sueldo;
	private String seccion;
	private  int id;
	private static int idSiguiente=1;
	private Date altaContrato;
	//private  ;
	public Empleado(String nom,double sue,int agno,int mes,int dia) {
		this.nombre=nom;
		this.sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(agno,mes-1,dia);
		altaContrato= calendario.getTime();
	}

	public Empleado(String nombre) {
		
		this.nombre=nombre;
		sueldo=3000;
		GregorianCalendar calendario= new GregorianCalendar(2020,06,14);
		altaContrato= calendario.getTime();
		seccion="admin";
		id=idSiguiente;
		idSiguiente++;
	}
	
	public Empleado(String nom, double sue) { //, ) {
		//this.id=Id;
		this.nombre=nom;
		this.sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(2020,06,14);
		altaContrato= calendario.getTime();
		//Class<Calendar> nw= Calendar.class;
		seccion="Administración";
		id=idSiguiente;
		idSiguiente++;
	}
	public Empleado (Empleado ab) { //constructor copia
		
		//Empleado pe=new Empleado(ab.nombre);
		this.nombre=ab.getNombre()+"copia";
		this.sueldo=ab.getSueldo();
		this.seccion=ab.getSeccion();
		this.altaContrato=ab.getAltaContrato();
		this.id=ab.id; //al ser static pe genera un nuevo id, si pongo ab, copiara bien
	
	}
	public String dameDatos() {
		
		return "El nombre del empleado es: " + nombre+ " su seccion es: " + seccion
				+" y el id es "+ id;
	}
	
		public void subeSueldo(double porciento) {
			this.sueldo+=( sueldo*porciento/100);
		}
		
		public double getSueldo() {
			return sueldo;
		}
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}
		public String getSeccion() {
			return seccion;
		}
		public void setSeccion(String seccion) {
			this.seccion = seccion;
		}
		public String getNombre() {
			return nombre;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	
		
		public static void  main (String [] args) {
			Empleado [] misEmpleados= new Empleado[4];
			misEmpleados[0] =new Empleado("JavierArray", 1350);
			misEmpleados[1] =new Empleado(misEmpleados[0]);
			misEmpleados[2] =new Empleado("Jose", 300);
			misEmpleados[3] =new Empleado("Juana");
			Jefatura jef= new Jefatura("Presidente", 30000, 2015,10,27);
			System.out.println(jef.getSueldo());
			jef.estableceIncentivo(35.6);
			System.out.println(jef.getSueldo());
//			Empleado emp1 = new Empleado("Javier", 1350);
//			Empleado emp2 = new Empleado("Marina", 1420);
//			Empleado emp3 = new Empleado ("Jose", 300);
//			emp2.setSeccion("Diseño");
//			emp1.setSueldo(3200);
//			System.out.println(emp1.dameDatos());
//			System.out.println(emp2.dameDatos());
//			System.out.println(emp3.dameDatos());
//			Empleado copia = new Empleado(emp1);
//			System.out.println(copia.dameDatos());
//			Empleado emp4 = new Empleado ("Juana", 300);
//			System.out.println(emp4.dameDatos());
			for (Empleado e: misEmpleados) {
				System.out.println("Nombre: "+ e.getNombre()+ " Salario: "+e.getSueldo()+ " y el ID: "+e.getId()
								+" su seccion es "+e.getSeccion()+ "\tfecha de alta: "+ e.getAltaContrato());
			}
			misEmpleados[2].subeSueldo(20);
			System.out.println(misEmpleados[2].getSueldo());
		
		}

		public Date getAltaContrato() {
			return altaContrato;
		}

		public void setAltaContrato(Date altaContrato) {
			this.altaContrato = altaContrato;
		}
}
