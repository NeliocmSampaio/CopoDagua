package baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BaralhoDeCopoDagua extends AbstractBaralho{

	private ArrayList<Carta> cartas;
	
	BaralhoDeCopoDagua (int num_de_jogadores) {

		cartas = new ArrayList<Carta>();
		
		String[] valor_da_carta = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		for (int i = 0; i < num_de_jogadores; i++) {
			
			Carta aux1 = new Carta();
			aux1.setValor(valor_da_carta[i]);
			aux1.setNome("Ouros");
			cartas.add(aux1);
			
			Carta aux2 = new Carta();
			aux2.setValor(valor_da_carta[i]);			
			aux2.setNome("Paus");
			cartas.add(aux2);

			Carta aux3 = new Carta();
			aux3.setValor(valor_da_carta[i]);			
			aux3.setNome("Copas");
			cartas.add(aux3);
		}
		
		Carta aux = new Carta(); 
		aux.setValor("A");
		aux.setNome("Espadas");
		cartas.add(aux);
	}
	
	public int getNumCartas() {
		
		return cartas.size();
	}
	
	@Override
	public void embaralhar() {

		long seed = System.nanoTime();

		Collections.shuffle(cartas, new Random(seed));
	}

	@Override
	public Carta removeCartaDeCima() {
		
		int ultima_posicao = getNumCartas()-1;
		
		return cartas.remove(ultima_posicao);
	}

	@Override
	public void adicionaCartaEmBaixo(Carta c) {
	
		cartas.add(0, c);
	}

	
}
