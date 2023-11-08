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
