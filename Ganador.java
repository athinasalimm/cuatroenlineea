package cuatroEnLinea;

public class Ganador extends Estado{

	public Ganador(Linea linea) {
		super(linea);
	}

	public void gameIsOver(Linea linea) {
		
		//aca hay q meterse a q variante es y ejecutarla
		//falta la estructura q separa el char y se lo manda a ejecutarVariante
		//linea.getVariante().ejecutarVariante();
		VarianteTriunfo.ejecutarVariante(linea.getVariante(), linea); //crep igual q esta mal llamarla asi
	}
			
	@Override
	public void ganador(Linea linea) {
		linea.setGanador("el ganador es.....");
		// how do we do this
	}

	@Override
	protected String turnogetter() {
		return null;
	}

	protected void moveRed(int columnaElegida) {}

	protected void moveBlue(int columnaElegida) {}

}

