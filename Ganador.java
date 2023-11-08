package cuatroEnLinea;

public class Ganador extends Estado{

	public Ganador(Linea linea) {
		super(linea);
	}

	public void gameIsOver(Linea linea) {
		//aca ver segun variantes puestas?? me imagino q aca comunicamos con variantes que comunican a linea
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
