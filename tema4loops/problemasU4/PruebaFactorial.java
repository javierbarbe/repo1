package problemasU4;

public class PruebaFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial f=new Factorial();
		Factorial q= new Factorial(44);
		System.out.println(q.getNumero());
		q.setFactorial(4);
		q.setNumero(14);
		System.out.println(q.getFactorial());
		System.out.println(q.getNumero());
	}

}
