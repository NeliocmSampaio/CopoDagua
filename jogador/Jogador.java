package jogador;

import java.util.ArrayList;

import miscelania.DoubleIdentifiedObject;

public abstract class Jogador {
	int id;
	ArrayList<DoubleIdentifiedObject> cartas;
	private boolean flag;
	
	
	public Jogador(int id)
	{
		this.id = id;
		this.flag = false;
		cartas = new ArrayList<DoubleIdentifiedObject>();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Boolean estaImpedido () {
		
		return flag;
	}
	
	public DoubleIdentifiedObject getCarta(int index)
	{
		return this.cartas.get(index);
	}//getCArta()
	
	public Boolean maoCheia()
	{
		return cartas.size() == 4;
	}

	public void showMaoDeCartas() {
		
		System.out.println("Cartas na sua mão:");
		for(int i=0; i<this.cartas.size(); i++)
		{
			System.out.println("["+i+"] " + cartas.get(i).getValor() + " de " + cartas.get(i).getNome());
		}
	}
	
	public Boolean recebeCarta(DoubleIdentifiedObject c)
	{
		if(maoCheia())
		{
			return false;
		}else
		{
			cartas.add(c);
			if(c.getValor() == "A" && c.getNome() == "Espadas")
				this.flag = true;
			else
				this.flag = false;
			return true;
		}
	}
	
	public abstract int selecionaCarta();
	
	public DoubleIdentifiedObject passaCarta(int i)
	{
		return cartas.remove(i);
	}
	
	public Boolean estaBatido()
	{
		return (this.cartas.get(0).getValor() ==
				this.cartas.get(1).getValor()) &&
				(this.cartas.get(1).getValor() ==
				this.cartas.get(2).getValor());
	}
}
