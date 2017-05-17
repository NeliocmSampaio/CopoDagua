package jogo;

import java.util.ArrayList;

import baralho.AbstractBaralho;
import baralho.FabricaDeBaralhoCopoDagua;
import jogador.Jogador;
import miscelania.DoubleIdentifiedObject;


public class Dealer {

	private static AbstractBaralho baralho = null;
	
	private static void preparaBaralho(int numJogadores)
	{
		AbstractBaralho baralhoCopoDagua = FabricaDeBaralhoCopoDagua.accessBaralho(numJogadores);
		
		baralho = baralhoCopoDagua;
	}
	
	private static DoubleIdentifiedObject daCarta()
	{
		return baralho.removeCartaDeCima();
	}

	public static void distribuiCartas(ArrayList<Jogador> jogadores) 
	{
		int qntd_de_cartas_por_jogador = 3;
		
		//recolheCartas(jogadores);
		
		preparaBaralho(jogadores.size());
		
		baralho.embaralhar();

		jogadores.get(0).recebeCarta(daCarta());
		
		for(int i=0; i<jogadores.size(); i++)
		{
			for (int j=0; j<qntd_de_cartas_por_jogador; j++)
			{
				DoubleIdentifiedObject carta = daCarta();
				jogadores.get(i).recebeCarta(carta);
			}
		}
	}
	
	/*private static void recolheCartas(ArrayList<Jogador> jogadores)
	{
		AbstractBaralho baralhoCopoDagua = FabricaDeBaralhoCopoDagua.accessBaralho(jogadores.size());
		
		baralho = baralhoCopoDagua;
		
	}*/
}
