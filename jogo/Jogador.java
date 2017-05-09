package jogo;

import baralho.Carta;
import java.util.Scanner;

public class Jogador {

	int id;
	Carta[] mao;
	
	public Jogador (int aux) {
		
		id = aux;
		mao = new Carta[4];
	}
	
	public void recebeCarta (Carta aux) {
		
		this.mao[3] = aux;
	}
	
	public Carta passaCarta () {
		
		Carta aux = this.escolheCarta();
		return aux;
	}
	
	public boolean estaBatido () {
		
		if ((mao[0] == mao[1]) && (mao[1] == mao[2])) return true;
		else return false;
	}
	
	public Carta escolheCarta() {
		
		//imprime as quatro cartas na mao do jogador
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
       	Carta aux = mao[a];
       	mao[a] = mao[3];        	
		return aux;
	}
}
