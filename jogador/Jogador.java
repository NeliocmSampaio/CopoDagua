package jogador;

import java.util.ArrayList;
import java.util.Scanner;

import baralho.Carta;

public abstract class Jogador {
	private int id;
	private ArrayList<Carta> cartas;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Boolean maoCheia()
	{
		return cartas.size() == 4;
	}
	
	public Boolean recebeCarta(Carta c)
	{
		if(maoCheia())
		{
			return false;
		}else
		{
			cartas.add(c);
			return true;
		}
	}
	
	public int selecionaCarta()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Cartas na sua mão:");
		for(int i=0; i<this.cartas.size(); i++)
		{
			System.out.println(cartas.get(i).toString());
		}
		
		int carta;
		do{
			carta = in.nextInt();
		}while(!(carta<4));
		
		System.out.println("Carta selecionada:");
		System.out.println(cartas.get(carta).toString());
		
		return carta;
	}
	
	public Carta passaCarta()
	{
		int carta = selecionaCarta();
		
		Carta c = this.cartas.get(carta);
		this.cartas.remove(carta);
		return c;
	}
	
	public Boolean estaBatido()
	{
		return (this.cartas.get(0).getNumero() ==
				this.cartas.get(1).getNumero()) &&
				(this.cartas.get(1).getNumero() ==
				this.cartas.get(2).getNumero());
	}
}
