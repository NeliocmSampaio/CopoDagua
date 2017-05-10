<<<<<<< HEAD
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
=======
package jogo;

public class Jogo {

	int num_jogadores;
	Jogador[] jogadores;
	boolean jogo_acabou;
	int jogador_da_vez;
	Jogador vencedor;
	Jogador perdedor;

	public Jogo () {
		
		
		
	}
	
	public void iniciaJogo () {
		
		
	}
	
	public boolean jogoNaoAcabou () {
		
		return !jogo_acabou;
	}
	
	public void setFimDeJogo () {
		
		this.jogo_acabou = true;
	}
	
	public void incrementaJogadorDaVez () {
		
		this.jogador_da_vez = (this.jogador_da_vez)%(this.num_jogadores) + 1;
	}
	
	public Jogador proximoJogador () {
		
		int aux = (this.jogador_da_vez)%(this.num_jogadores) + 1;
		return this.jogadores[aux];
	}
	
	public Jogador jogadorAtual () {
		
		int aux = (this.jogador_da_vez);
		return this.jogadores[aux];
	}

	public Jogador jogadorAnterior () {
	
		int aux;
		if (this.jogador_da_vez == 1) aux = this.num_jogadores;
		else aux = this.jogador_da_vez - 1;
		return this.jogadores[aux];
	}
	
	public void setVencedor(Jogador aux) {
		
		this.vencedor = aux;
	}
	
	public void setPerdedor(Jogador aux) {
		
		this.perdedor = aux;
	}
}
>>>>>>> 7daf9a106d18229805262cc9eff1637803776ecd
