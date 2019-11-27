package programacionNoviembre;

public class CuentaCorriente {
//atributos 
	//int numCuenta;
	String numCuenta;
	int inum1 ,inum2, saldo=0; //inum;
	String snum1, snum2, num;
	
	
	public CuentaCorriente() {
	
		//this.numCuenta;
		inum1= ((int)Math.round(Math.random()*100000));
		inum2= ((int)Math.round(Math.random()*100000));
		snum1= Integer.toString(inum1);
		snum2= Integer.toString(inum2);
		
		num= (snum1+snum2);
		//inum= Integer.parseInt(snum1+snum2);
		this.numCuenta=num;
		
		this.saldo=saldo;
		
	}
	
	public CuentaCorriente(int saldo) {
		
			//this.numCuenta;
			inum1= ((int)Math.round(Math.random()*100000));
			inum2= ((int)Math.round(Math.random()*100000));
			snum1= Integer.toString(inum1);
			snum2= Integer.toString(inum2);
			
			num= (snum1+snum2);
			this.saldo=saldo;
			this.numCuenta=num;
			
		}
	
	/*public CuentaCorriente() {
		int inum1;
		String snum2;
			//this.numCuenta;
			snum2= (Math.round(Math.random()*100)).toString();
		//	inum2= ((int)Math.round(Math.random()*100000));
		//	snum1= Integer.toString(inum1);
			//snum2= Integer.toString(inum2);
			
			inum= Integer.parseInt(snum1+snum2);
			this.numCuenta=inum;
	*/
	
}
