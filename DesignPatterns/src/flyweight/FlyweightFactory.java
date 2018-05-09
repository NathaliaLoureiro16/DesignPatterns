package flyweight;

import java.util.ArrayList;

public class FlyweightFactory {
	 protected ArrayList<Flyweight> flyweights;
	 
	    public enum Objgrafico {
	        JOGADOR, INIMIGO_1, INIMIGO_2, INIMIGO_3, CENARIO_1, CENARIO_2
	    }
	 
	    public FlyweightFactory() {
	        flyweights = new ArrayList<Flyweight>();
	        flyweights.add(new ObjetoGrafico("jogador.png"));
	        flyweights.add(new ObjetoGrafico("inimigo1.png"));
	        flyweights.add(new ObjetoGrafico("inimigo2.png"));
	        flyweights.add(new ObjetoGrafico("inimigo3.png"));
	        flyweights.add(new ObjetoGrafico("cenario1.png"));
	        flyweights.add(new ObjetoGrafico("cenario2.png"));
	    }
	 
	    public Flyweight getFlyweight(Objgrafico jogador) {
	        switch (jogador) {
	        case JOGADOR:
	            return flyweights.get(0);
	        case INIMIGO_1:
	            return flyweights.get(1);
	        case INIMIGO_2:
	            return flyweights.get(2);
	        case INIMIGO_3:
	            return flyweights.get(3);
	        case CENARIO_1:
	            return flyweights.get(4);
	        default:
	            return flyweights.get(5);
	        }
	    }
}
//A fábrica cria e gerencia objetos flyweight.
