package jogo;

import java.util.ArrayList;

import jogador.Jogador;

public class Jogo {
	
	//Atributos
	private int numJogadores;
	private int jogadorDaVez;
	private ArrayList<Jogador> jogadores;
	private Boolean jogoAcabou;
	private Jogador vencedor;
	private Jogador perdedor;
	
	public void iniciaJogo()
	{
		
	}
	
	public Boolean jogoNaoAcabou()
	{
		return true;
	}
	
	public void setFimJogo()
	{
		
	}
	
	public void incrementaJogadorDaVez()
	{
		this.jogadorDaVez = (this.jogadorDaVez)%this.numJogadores;
	}
	
	public Jogador proximoJogador()
	{
		return this.jogadores.get((jogadorDaVez+1) % this.numJogadores);
	}
	
	public Jogador jogadorAtual()
	{
		return this.jogadores.get(jogadorDaVez);
	}
	
	public Jogador jogadorAnterior()
	{
		return this.jogadores.get((jogadorDaVez-1) % this.numJogadores);
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