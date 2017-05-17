package baralho;

public class FabricaDeBaralhoCopoDagua extends AbstractFabricaDeBaralho {

	private static boolean instanciado = false;
	private static AbstractBaralho baralho;

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
			setBaralho(new BaralhoDeCopoDagua(N));
			return getBaralho();
		}
	}
}
