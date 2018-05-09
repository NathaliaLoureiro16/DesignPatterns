package factorymethod;

public class FactoryCS implements factory {

	@Override
	public Jogo CriarJogo() {
		return new CounterStrike("cs","Tiro em primeira pessoa", "Valve", "windows,xbox,mac,linux", 20, "08 de novembro de 2000");
	}

}
