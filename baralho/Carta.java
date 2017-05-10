package baralho;

public class Carta {

	private int valor;
	private int nype;
	
	public Carta () {
		
		valor = 0;
		nype = 0;
	}
	
	public Carta (int i, int j) {
		
		valor = i;
		nype = j;
	}
	
	public void setNype(int i) {
		
		this.nype = i;
	}
	
	public void setValor(int i) {
		
		this.valor = i;
	}

	public int getNype() {
		
		return this.nype;
	}
	
	public int getValor() {
		
		return this.valor;
	}
	
}
