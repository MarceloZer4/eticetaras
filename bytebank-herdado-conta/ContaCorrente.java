
//new ContaCorrente()
public class ContaCorrente extends Conta {


	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}
	
	
	/* (non-Javadoc)
	 * @see Conta#saca(double)
	 @Override*/
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}


	/* (non-Javadoc)
	 * @see Conta#deposita(double)
	 */
	public void deposita(double valor) {
		super.saldo += valor;
		//super.saldo = super.saldo + valor; -> same fucking shit
	}


}
