package cuatroEnLinea;

public class VarianteTipoB extends VarianteTriunfo{

	public VarianteTipoB(Linea linea, char variante) {
		super();
	}
	
	@Override
	public boolean findVariante(char variante) {
		return variante == 'b';
	}

	@Override
	public boolean executeVariante(Linea linea) {
		return false ; //aca seria el can win diagonal
	}



}

