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
