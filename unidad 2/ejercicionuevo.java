import java.util.Scanner;

public class ejercicionuevo
{
	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);
		
		int seg;
		int minutos;
		int segundos;
		
		System.out.print("Introduzca la cantidad de segundos");
		
		seg = ent.nextInt();
		
		minutos = seg / 60;
		segundos = seg %60;
		
		System.out.printf("Equivale a %d minutos y %d segundos %n", minutos, segundos);
	}
}
