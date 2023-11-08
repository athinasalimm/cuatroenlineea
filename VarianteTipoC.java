package cuatroEnLinea;

public class VarianteTipoC extends VarianteTriunfo{

	public VarianteTipoC(Linea linea, char variante) {
		super();
	}


	@Override
	public boolean findVariante(char variante) {
		return variante == 'c';
	}


	@Override
	public boolean executeVariante(Linea linea) {
		return (linea.canWinHorizontally() || linea.canWinVertically()); //aca tb iria diagonal
	}


}

