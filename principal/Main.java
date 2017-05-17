package principal;

import java.util.Scanner;

import jogo.Jogo;

public class Main {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Jogo Copo D'água");
		System.out.println("Insira o número de jogadores:");
		int numJogadores = in.nextInt();
		
/*		System.out.println("Agora insira quantos desses jogadores são IA:");
		int cpu = in.nextInt();*/
		
		Jogo copoDagua = new Jogo(numJogadores);
		copoDagua.jogar();
		
		copoDagua.showVencedor();
		copoDagua.showPerdedor();
	}
}
