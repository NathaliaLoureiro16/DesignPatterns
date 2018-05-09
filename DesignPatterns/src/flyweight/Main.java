package flyweight;

import flyweight.FlyweightFactory.Objgrafico;

public class Main {
	public static void main(String[] args) {
	    FlyweightFactory factory = new FlyweightFactory();
	 
	    factory.getFlyweight(Objgrafico.CENARIO_1).desenharImagem(new Ponto(0, 0));
	 
	    factory.getFlyweight(Objgrafico.JOGADOR).desenharImagem(new Ponto(10, 10));
	 
	    factory.getFlyweight(Objgrafico.INIMIGO_1).desenharImagem(
	            new Ponto(100, 10));
	    factory.getFlyweight(Objgrafico.INIMIGO_1).desenharImagem(
	            new Ponto(120, 10));
	    factory.getFlyweight(Objgrafico.INIMIGO_1).desenharImagem(
	            new Ponto(140, 10));
	 
	    factory.getFlyweight(Objgrafico.INIMIGO_2).desenharImagem(
	            new Ponto(60, 10));
	    factory.getFlyweight(Objgrafico.INIMIGO_2).desenharImagem(
	            new Ponto(50, 10));
	 
	    factory.getFlyweight(Objgrafico.INIMIGO_3).desenharImagem(
	            new Ponto(170, 10));
	}
}
