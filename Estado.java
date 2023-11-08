package cuatroEnLinea;

public abstract class Estado {
	protected Linea linea;
	
	public abstract void gameIsOver(Linea linea);
	public abstract void ganador(Linea linea);
	protected abstract String turnogetter();
	
	public Estado( Linea game ) {
		linea = game;
	}
	protected abstract void moveRed(int columnaElegida);
	protected abstract void moveBlue(int columnaElegida);


}
