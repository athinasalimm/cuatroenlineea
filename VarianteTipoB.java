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
	public boolean canWinVertically(Linea linea) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canWinHorizontally(Linea linea) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canWinDiagonally(Linea linea) {
		// TODO Auto-generated method stub
		return false;
	}

}
