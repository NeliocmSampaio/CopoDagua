package baralho;

import java.util.ArrayList;

public abstract class AbstractBaralho {
	
	private ArrayList<Carta> cartas;

	public int getNumCartas() {
		
		return cartas.size();
	}
	
	public abstract void embaralhar();
	
	public abstract void adicionaCartaEmBaixo(Carta c);
	
	public abstract Carta removeCartaDeCima();
}
