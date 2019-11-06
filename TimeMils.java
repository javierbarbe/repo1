

public class TimeMils {
	
	public static void main (String[] args) {
		long tiemposeg;
		long tiempomi;
		long segact;
		long minutos;
		long minact;
		long totalhoras;
		long horaact;
		long diact;
		long diaspasados;
		long mesespasados;
		long añospasados;
		long añoactual;
		long mesact; 
		
		tiemposeg=System.currentTimeMillis()/1000;
		System.out.printf("Segundos %d%n", tiemposeg);
	
		tiempomi=System.currentTimeMillis();
		System.out.printf("Miliseg %d%n", tiempomi);
	
		segact=tiemposeg%60;
		System.out.printf("Segundo actual: %d%n", segact);
	
		minutos=tiemposeg/60;
		System.out.printf("Minuto desde 1970 %d%n", minutos); 
		
		minact=minutos%60;
		System.out.printf("Minuto actual %d%n", minact);//12  años bisiestos
		
		totalhoras=minutos/60;
		System.out.printf("Horas pasadas desde 1970 %d%n", totalhoras);
		
		horaact=totalhoras%24;
		System.out.printf("Hora actual %d%n", horaact);
		
		diaspasados=totalhoras/24;
		System.out.printf("Dias pasados %d%n", diaspasados);
		
		diact=totalhoras%24;
		System.out.printf("Dia actual %d%n", diact);
		
		mesespasados=diaspasados/30;
		System.out.printf("Han pasado %d meses%n", mesespasados);
		
		añospasados=totalhoras/24/365;
		System.out.printf("Han pasado %d años %n", añospasados);
		
		añoactual=añospasados+1970;
		System.out.printf("Año actual %d%n", añoactual);	
		
		mesact=mesespasados%12;
		System.out.printf("Mes actual %d%n", mesact);
		 //horaact=totalhoras%60

	System.out.printf("La fecha es %d/%d/%d // Hora segun GMT+2 %d:%d:%d%n", diact, mesact, añoactual,horaact+2,minact, segact);
	}
}

