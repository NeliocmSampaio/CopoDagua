package baralho;

import java.util.Random;

public abstract class Baralho {

	int qntd_de_cartas;
	Carta[] cartas;

	public int getQntdDeCartas () {
		
		return this.qntd_de_cartas;
	}
	
	public void embaralhar () {
		
		Carta aux;
		int randomIntA;
		int randomIntB;
		
	    Random randomGenerator = new Random();
	    for (int i = 1; i <= 1000; ++i){

	    	randomIntA = randomGenerator.nextInt(this.qntd_de_cartas);
	    	randomIntB = randomGenerator.nextInt(this.qntd_de_cartas);
	    	aux = this.cartas[randomIntA];
	    	this.cartas[randomIntA] = this.cartas[randomIntB];
	    	this.cartas[randomIntB] = aux;
	    }
	}
	
	public void adicionarCartaEmCima (Carta aux) {
		
		Carta[] novoBaralho = new Carta[this.qntd_de_cartas + 1];
		
		for (int i=0;i<this.qntd_de_cartas; ++i) {
			
			novoBaralho[i] = this.cartas[i];
		}
		
		novoBaralho[this.qntd_de_cartas] = aux;
		
		this.qntd_de_cartas = this.qntd_de_cartas + 1;
		this.cartas = novoBaralho;
	}
	
	public Carta removerCartaDeCima () {
		
		Carta[] novoBaralho = new Carta[this.qntd_de_cartas - 1];
		Carta aux;
		
		for (int i=0; i<this.qntd_de_cartas - 1; ++i) {
			
			novoBaralho[i] = this.cartas[i];
		}
		aux = this.cartas[this.qntd_de_cartas - 1];
		this.qntd_de_cartas = this.qntd_de_cartas - 1;
		this.cartas = novoBaralho;
		return aux;
	}
}

