package jogo;

import java.util.ArrayList;

import jogador.Cpu;
import jogador.Jogador;
import jogador.Player;
import miscelania.DoubleIdentifiedObject;
import baralho.Carta;

public class Jogo extends AbstractJogo{
	
	//Atributos
	private ArrayList<Jogador> jogadores;
	private Jogador vencedor;
	private Jogador perdedor;
	private DoubleIdentifiedObject asDeEspadas;
	
	public Jogo(int nJogadores)
	{
		this.jogadores = new ArrayList<Jogador>();
		this.vencedor = null;
		this.perdedor = null;
		this.asDeEspadas = new Carta();
		asDeEspadas.setValor("A");
		asDeEspadas.setNome("Espadas");

		for(int i=0; i<nJogadores; i++)
		{
			Jogador j = new Player(i);
			this.jogadores.add(j);
		}//for
				
		preparaJogo();
	}
	
	public Jogo(int nJogadores, int nCPUs)
	{
		this.jogadores = new ArrayList<Jogador>();
		this.vencedor = null;
		this.perdedor = null;
		this.asDeEspadas = new Carta();
		asDeEspadas.setValor("A");
		asDeEspadas.setNome("Espadas");
		
		for(int i=0; i<nJogadores-nCPUs; i++)
		{
			Jogador j = new Player(i);
			this.jogadores.add(j);
		}//for
		
		for(int i=nJogadores-nCPUs; i<nJogadores; i++)
		{
			Jogador j = new Cpu(i);
			this.jogadores.add(j);
		}//for
		
		preparaJogo();
	}
	
	private void preparaJogo() {
		
		Dealer.distribuiCartas(jogadores);
	}
	
	private int numDeJogadores () {
		
		return jogadores.size();
	}
	
	private void showJogadores(Jogador atual) {
		
		System.out.println("Jogador " + atual.getId());
		//System.out.println("num jogadores: " + numDeJogadores());
	}
	
	public void jogar()
	{
		boolean jogoAcabou = false;
		
		while(!jogoAcabou) {
			
			for (int i=0; i<numDeJogadores(); i++) {
				
				int j = (i + 1)%numDeJogadores();
				
				Jogador atual = jogadores.get(i);
				Jogador proximo = jogadores.get(j);
				
				showJogadores(atual);
				
				int index;
				
				if (atual.estaImpedido()) {
					
					atual.showMaoDeCartas();
					do {
						index = atual.selecionaCarta(); 
						
					} while (atual.getCarta(index).getValor() == asDeEspadas.getValor() && atual.getCarta(index).getNome() == asDeEspadas.getNome());
				}
				else {
					
					atual.showMaoDeCartas();
					index = atual.selecionaCarta(); 
				}
				
				proximo.recebeCarta(atual.passaCarta(index));
				
				if (atual.estaBatido()) {
				
					Jogador anterior;
					if (i == 0) {
					
						anterior = jogadores.get(numDeJogadores() - 1);
					}
					else {
						
						anterior = jogadores.get(i - 1);
					}
					
					setVencedor(atual);
					setPerdedor(anterior);			
					jogoAcabou = true;
					break;
				}
			}
		}
	}
	
	public void setVencedor(Jogador j)
	{
		this.vencedor = j;
	}
	
	public void setPerdedor(Jogador j)
	{
		this.perdedor = j;
	}
	
	public void showVencedor()
	{
		System.out.println("****VENCEDOR*****");
		System.out.println("Jogador: "+ this.vencedor.getId());
		System.out.println("******************");
	}

	public void showPerdedor()
	{
		System.out.println("****PERDEDOR*****");
		System.out.println("Jogador: "+ this.perdedor.getId());
		System.out.println("******************");
	}
}