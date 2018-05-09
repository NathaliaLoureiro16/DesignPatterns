package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Banco> lista = new ArrayList<Banco>();
		ContaCorrente contaCorrente = new ContaCorrente(100.00);
		ContaPoupanca contaPoupanca = new ContaPoupanca(1000.00);

		Banco bancoX = new Banco();
		bancoX.getContas().add(contaPoupanca);
		bancoX.getContas().add(contaCorrente);

		lista.add(bancoX);

		AtualizaConta atualizaConta = new AtualizaConta();
		for (Banco banco : lista) {
			banco.atualizando(atualizaConta);
		}

		for (Banco banco : lista) {
			for (Conta conta : banco.getContas()) {
				System.out.println(conta.getClass().getSimpleName() + " " + conta.getSaldo());
			}
		}
	}
}
