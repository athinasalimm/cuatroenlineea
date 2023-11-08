package cuatroEnLinea;

import java.util.Arrays;
import java.util.List;

public abstract class VarianteTriunfo {
	char variante;
	Linea linea;
	
	List<VarianteTriunfo> listavariante = Arrays.asList( 
			new VarianteTipoA(linea, variante), 
			new VarianteTipoB(linea, variante),
			new VarianteTipoC(linea, variante));
	
	
	//
	
	public void ejecutarVariante(char variante, Linea linea) {
		listavariante.stream().filter(varianteObject -> varianteObject.findVariante(variante)).forEach(varianteObject -> varianteObject.canWin(linea));
	}
	
		
		public abstract boolean findVariante(char variante);

		public abstract boolean canWinVertically(Linea linea);
		
		public abstract boolean canWinHorizontally(Linea linea);
		
		public abstract boolean canWinDiagonally(Linea linea);



}
