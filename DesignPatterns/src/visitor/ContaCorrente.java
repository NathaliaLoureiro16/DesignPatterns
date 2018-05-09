package visitor;

public class ContaCorrente extends Conta{
	 
	private double saldo;
	
	public ContaCorrente(double saldo) {
		super(saldo);
		this.saldo = saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {

		return saldo;
	}

	@Override
	public void atualiza(AtualizadorDeConta atualizadorDeConta) {
		 atualizadorDeConta.atualiza(this);
		
	}
}
