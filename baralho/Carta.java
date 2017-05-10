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
	
	void setNype(int i) {
		
		this.nype = i;
	}
	
	void setValor(int i) {
		
		this.valor = i;
	}

	int getNype() {
		
		return this.nype;
	}
	
	int getValor() {
		
		return this.valor;
	}
	
}
