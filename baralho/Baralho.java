package baralho;

import java.util.ArrayList;
import java.util.Random;

public abstract class Baralho {
	private ArrayList<Carta> cartas;
	private int numCartas;
	
	public void addCarta(Carta c)
	{
		this.cartas.add(c);
	}//addCarta()
	
	public void addCarta(Carta c, int i)
	{
		this.cartas.add(i, c);
	}//addCarta()
	
	public Carta getCarta()
	{
		Random random = new Random();
		int indice = random.nextInt(numCartas);
		Carta c = this.cartas.get(indice);
		this.cartas.remove(indice);
		
		return c;
	}//getCarta()
	
	public Carta getCarta(int indice)
	{
		Carta c = this.cartas.get(indice);
		this.cartas.remove(indice);
		return c;
	}//getCarta()
	
}
