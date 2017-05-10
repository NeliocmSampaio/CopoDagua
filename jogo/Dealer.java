/**
 * 
 */
package jogo;

import baralho.Carta;
import baralho.Baralho;

/**
 * @author MARCIO
 *
 */
public class Dealer {

	public void embaralhaBaralho (Baralho baralho) {
		
		baralho.embaralhar();
	}
	
	public void insereAsDeEspadas (Baralho baralho) {
		
		Carta aux = new Carta();
		aux.setNype(1);
		aux.setValor(1);
		
		baralho.adicionarCartaEmCima(aux);
	}

	public Carta darUmaCarta (Baralho baralho) {
		
		return baralho.removerCartaDeCima();
	}
}
