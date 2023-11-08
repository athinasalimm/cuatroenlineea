package cuatroEnLinea;

public class Empate extends Estado{ //este si puede ser desp azul

	public Empate(Linea linea) {
		super(linea);
	}
	
	public void gameIsOver(Linea linea) {
		linea.hayempate();
	}

	public void ganador(Linea linea) {
		 linea.setGanador("No hay ganador, es un empate");
	}

	protected String turnogetter() {
		return null;
	}

	protected void moveRed(int columnaElegida) {}

	protected void moveBlue(int columnaElegida) {}

}
