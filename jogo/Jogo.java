package jogo;

import baralho.BaralhoSelecionado;

public class Jogo {

	int num_jogadores;
	Jogador[] jogadores;
	boolean jogo_acabou;
	int jogador_da_vez;
	Jogador vencedor;
	Jogador perdedor;

	public Jogo (int qntd) {
		
		num_jogadores = qntd;
		jogadores = new Jogador[qntd+1];
		jogo_acabou = false;
		jogador_da_vez = 1;
		vencedor = jogadores[0];				
		perdedor = jogadores[0];	

		BaralhoSelecionado aux = new BaralhoSelecionado(qntd*3);

		Dealer dealer = new Dealer();
		dealer.insereAsDeEspadas(aux);
		dealer.embaralhaBaralho(aux);
		jogadores[1].recebeCarta(dealer.darUmaCarta(aux));
		
		for (int i=1;i<=num_jogadores;++i) {
			jogadores[i].setID(i);
			jogadores[i].recebeCarta(dealer.darUmaCarta(aux));
			jogadores[i].recebeCarta(dealer.darUmaCarta(aux));
			jogadores[i].recebeCarta(dealer.darUmaCarta(aux));
		}
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
	
	public Jogador showVencedor () {
		
		System.out.print(this.vencedor.getID());
		return this.vencedor;
	}
	
	public Jogador showPerdedor () {
		
		System.out.print(this.perdedor.getID());
		return this.perdedor;
	}
	
	public void iniciaJogo () {
		
		this.proximoJogador().recebeCarta (this.jogadorAtual().passaCarta());
		this.incrementaJogadorDaVez ();
		while (this.jogoNaoAcabou()) {

			this.proximoJogador().recebeCarta (this.jogadorAtual().passaCarta());

			if (this.jogadorAtual().estaBatido()) {

				this.setVencedor(this.jogadorAtual());
				this.setPerdedor(this.jogadorAnterior());
				this.setFimDeJogo();
			}
			else this.incrementaJogadorDaVez();
		}
				
	}
}
