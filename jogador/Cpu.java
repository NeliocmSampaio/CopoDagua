package jogador;

import java.util.Random;

public class Cpu extends Jogador{

	public Cpu(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int selecionaCarta() {
		
		Random random = new Random();
		return random.nextInt(super.cartas.size());
	}

}
