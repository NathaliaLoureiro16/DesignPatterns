package flyweight;

public class ObjetoGrafico extends Flyweight{

	 protected Imagem imagem;
	 
	    public ObjetoGrafico(String nomeDaImagem) {
	        imagem = new Imagem(nomeDaImagem);
	    }
	 
	    @Override
	    public void desenharImagem(Ponto ponto) {
	        imagem.desenharImagem();
	        System.out.println("No ponto (" + ponto.x + "," + ponto.y + ")!");
	    }

}
