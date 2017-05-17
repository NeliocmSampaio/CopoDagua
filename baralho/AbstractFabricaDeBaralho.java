package baralho;

public abstract class AbstractFabricaDeBaralho {

	private static boolean instanciado = false;
	private static AbstractBaralho baralho = null;

	private static void setInstancia() {
		
		instanciado = true;
	}

	private static void setBaralho(AbstractBaralho novoBaralho) {
		
		baralho = novoBaralho;
	}
	
	private static AbstractBaralho getBaralho() {
		
		return baralho;
	}
	
	public static AbstractBaralho accessBaralho(int N) {
			
		if (instanciado) {
			
			return getBaralho();
		}
		else {
			
			setInstancia();
			setBaralho(null);
			return getBaralho();
		}
	}
}
