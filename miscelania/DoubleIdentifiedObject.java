package miscelania;

public abstract class DoubleIdentifiedObject {
	
	private String valor;
	private String nome;

	public void setValor(String s) {

		this.valor = s;
	}

	public void setNome(String s) {

		this.nome = s;
	}
	
	public String getValor() {
		
		return valor;
	}
	
	public String getNome() {
		
		return nome;
	}
	
}