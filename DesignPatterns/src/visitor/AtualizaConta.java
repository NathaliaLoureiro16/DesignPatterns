package visitor;

public class AtualizaConta implements AtualizadorDeConta {

	@Override
	public void atualiza(ContaCorrente contaCorrente) {
		contaCorrente.setSaldo(contaCorrente.getSaldo() + contaCorrente.getSaldo() * 0.00);

	}

	@Override
	public void atualiza(ContaPoupanca contaPoupanca) {
		contaPoupanca.setSaldo(contaPoupanca.getSaldo() + contaPoupanca.getSaldo()* 0.5);

	}


}
