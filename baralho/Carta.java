package baralho;

public class Carta extends miscelania.DoubleIdentifiedObject{
	//Atributos
	private String valor;				//numero
	private String nome;				//naipe
	
	//Metodos
	
	public void setValor(String s) {

		this.valor = s;
	}

	public void setNome(String s) {

		this.nome = s;
	}
	
	public String getNome() {
		
		return nome;
	}
		
	public String getValor() {
		
		return this.valor;
	}
	
	public String getNaipe() {

		return this.getNome();
	}
}
