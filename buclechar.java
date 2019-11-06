import java.util.Scanner;

public class buclechar {
	
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		char continueLoop= 'Y';
		while (continueLoop=='Y'){
			System.out.println("Introduce Y para seguir N para parar");
			continueLoop= input.next().charAt(0);
			}
		
	}
}

