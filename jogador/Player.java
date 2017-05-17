package jogador;

import java.util.Scanner;

public class Player extends Jogador{

	public Player(int id) {
		super(id);
	}

	@Override
	public int selecionaCarta() {
		
		System.out.println("Selecione a carta para passar.");
		
		Scanner in = new Scanner(System.in);
		
		int i = in.nextInt();
		
		System.out.println("Carta selecionada:");
		System.out.println(cartas.get(i).getValor() + " de " + cartas.get(i).getNome());
		
		return i;
	}

}
