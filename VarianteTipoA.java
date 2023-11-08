package cuatroEnLinea;


public class VarianteTipoA extends VarianteTriunfo{

	public VarianteTipoA(Linea linea, char variante) {
		super();

	}
	
	public boolean findVariante(char variante) {
		return variante == 'a';
	}
	
	public boolean executeVariante(Linea linea) {
		return ((linea.canWinVertically() || linea.canWinHorizontally()));
	}
	


}


