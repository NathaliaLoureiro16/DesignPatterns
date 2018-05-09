package visitor;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Conta> contas = new ArrayList<Conta>();

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void atualizando(AtualizadorDeConta atualizadorDeConta) {
		for (Conta conta : contas) {
			conta.atualiza(atualizadorDeConta);
		}
	}
}
