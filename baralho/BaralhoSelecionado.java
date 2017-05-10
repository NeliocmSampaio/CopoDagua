package baralho;

import java.util.Random;

public class BaralhoSelecionado extends Baralho {

	public BaralhoSelecionado (int n) {
		
		super.qntd_de_cartas = n;
		super.cartas = new Carta[n];
		
		for (int i = 0; i < n; ++i) {
			
			super.cartas[i].setValor(i%12 + 2);
			super.cartas[i].setNype(i%3 + 1);
		}		
	}
	
	public void embaralhar () {
		
		Carta aux;
		int randomIntA;
		int randomIntB;
		
	    Random randomGenerator = new Random();
	    for (int i = 1; i <= 1000; ++i){

	    	randomIntA = randomGenerator.nextInt(super.qntd_de_cartas);
	    	randomIntB = randomGenerator.nextInt(super.qntd_de_cartas);
	    	aux = super.cartas[randomIntA];
	    	super.cartas[randomIntA] = super.cartas[randomIntB];
	    	super.cartas[randomIntB] = aux;
	    }
	}
	
	public void adicionarCarta(Carta aux) {
		
		int qntd_de_cartas = super.getQntdDeCartas();
		Carta[] novoBaralho = new Carta[qntd_de_cartas + 1];
		
		for (int i=0;i<qntd_de_cartas; ++i) {
			
			novoBaralho[i] = super.cartas[i];
		}
		
		novoBaralho[qntd_de_cartas] = aux;
		
		super.cartas = novoBaralho;
	}
}
