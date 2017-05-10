package baralho;

import java.util.Random;

public class BaralhoSelecionado extends Baralho {

	int qntd_de_cartas;
	int qntd_de_nypes;

	public BaralhoSelecionado (int n) {
		
		cartas = new Carta[n];
		
		for (int i = 0; i < n; ++i) {
			
			cartas[i].setValor(i%13 + 2);
			cartas[i].setNype(i%3 + 1);
		}		
	}
	
	public void embaralhar () {
		
		Carta aux;
		int randomIntA;
		int randomIntB;
		
	    Random randomGenerator = new Random();
	    for (int i = 1; i <= 1000; ++i){

	    	randomIntA = randomGenerator.nextInt(this.qntd_de_cartas);
	    	randomIntB = randomGenerator.nextInt(this.qntd_de_cartas);
	    	aux = cartas[randomIntA];
	    	cartas[randomIntA] = cartas[randomIntB];
	    	cartas[randomIntB] = aux;
	    }
	}
	
	public void adicionarCarta(Carta aux) {
		
		Carta[] novoBaralho = new Carta[this.qntd_de_cartas + 1];
		
		for (int i=0;i<this.qntd_de_cartas; ++i) {
			
			novoBaralho[i] = super.cartas[i];
		}
		
		novoBaralho[this.qntd_de_cartas] = aux;
		
		super.cartas = novoBaralho;
	}
	
	
	
}
