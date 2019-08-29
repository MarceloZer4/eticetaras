
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);

	}

	/* (non-Javadoc)
	 * @see Conta#deposita(double)
	 */
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	

}
