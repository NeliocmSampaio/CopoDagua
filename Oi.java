import java.util.Scanner;

import jogo.Jogo;

public class Oi {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        int qntd_jogadores = scan.nextInt();
        scan.close();

		Jogo jogo = new Jogo (qntd_jogadores);

		jogo.iniciaJogo ();

		jogo.showVencedor ();

		jogo.showPerdedor ();
	}
}
