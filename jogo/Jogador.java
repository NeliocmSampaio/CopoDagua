package jogo;

import baralho.Carta;
import java.util.Scanner;

public class Jogador {

	int id;
	int qntd_de_cartas;
	Carta[] mao;
	
	public Jogador (int aux) {
		
		id = aux;
		mao = new Carta[4];
		qntd_de_cartas = 0;
	}
	
	public void setID (int i) {
		
		this.id = i;
	}
	
	public int getID () {
		
		return this.id;
	}
	
	public void recebeCarta (Carta aux) {
		
		this.mao[this.qntd_de_cartas] = aux;
		this.qntd_de_cartas = this.qntd_de_cartas + 1;
	}
	
	public Carta passaCarta () {
		
		Carta aux = this.escolheCarta();
		this.qntd_de_cartas = this.qntd_de_cartas - 1;
		return aux;
	}
	
	public boolean estaBatido () {
		
		if ((mao[0] == mao[1]) && (mao[1] == mao[2])) return true;
		else return false;
	}
	
	public Carta escolheCarta() {
		
		System.out.println("Cartas na sua mao:");
		for (int i=0; i<4;++i) System.out.format("Carta %d: valor %d e nype %d\n", (i+1), this.mao[i].getValor(), this.mao[i].getNype());
		
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        Carta aux = mao[a];
       	mao[a] = mao[3];        	
		return aux;
	}
}
