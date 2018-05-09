package factorymethod;

public class Main {
	public static void main(String[] args) {
		FactoryBF bf = new FactoryBF();
		FactoryCS cs = new FactoryCS();
		
		System.out.println(bf.CriarJogo());
		System.out.println(cs.CriarJogo());
		
	}
}

