package factorymethod;

public class Jogo {

	private String sigla;
	private String estilo;
	private String distribuidora;
	private String Plataforma;
	private int preco;
	private String dataLancamento;

	public Jogo(String sigla, String estilo, String distribuidora, String plataforma, int preco,
			String dataLancamento) {
		super();
		this.sigla = sigla;
		this.estilo = estilo;
		this.distribuidora = distribuidora;
		Plataforma = plataforma;
		this.preco = preco;
		this.dataLancamento = dataLancamento;
	}

	public String getSigla() {
		return sigla;
	}

	public String getEstilo() {
		return estilo;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public String getPlataforma() {
		return Plataforma;
	}

	public void setPlataforma(String plataforma) {
		Plataforma = plataforma;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	@Override
	public String toString() {
		return "Jogo [sigla=" + sigla + ", estilo=" + estilo + ", distribuidora=" + distribuidora + ", Plataforma="
				+ Plataforma + ", preco=" + preco + ", dataLancamento=" + dataLancamento + "]";
	}

}
