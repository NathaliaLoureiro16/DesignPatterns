package factorymethod;

public class FactoryBF implements factory {

	@Override
	public Jogo CriarJogo() {
		return new Battlefield("BF", "Tiro em primeira pessoa", "Electronic Arts", "windows, play 3, play 4,xbox one", 39, "29 de outubro de 2013");
	}

}
