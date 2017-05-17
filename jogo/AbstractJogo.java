package jogo;

import java.util.ArrayList;

import jogador.Jogador;

public abstract class AbstractJogo {

	@SuppressWarnings("unused")
	private ArrayList<Jogador> jogadores;
	@SuppressWarnings("unused")
	private Jogador vencedor;
	@SuppressWarnings("unused")
	private Jogador perdedor;
	
	public abstract void jogar();
	
	public abstract void showVencedor();
	
	public abstract void showPerdedor();

	@SuppressWarnings("unused")
	private void setVencedor(Jogador vencedor) {
		this.vencedor = vencedor;
	}

	@SuppressWarnings("unused")
	private void setPerdedor(Jogador perdedor) {
		this.perdedor = perdedor;
	}
	
}
