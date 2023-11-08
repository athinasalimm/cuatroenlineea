package cuatroEnLinea;


public class TurnoRojo extends Estado {


	public TurnoRojo(Linea game) {
		super(game);
	}

	public void moveBlue(int columna) {
		throw new RuntimeException("No es el turno de azul");
		
	}

	public void moveRed(int columna) {
		linea.moverfichita(columna, 'X', new TurnoAzul(linea)); //juego es la linea q entro en el constructor de turno 
	}

	public String turnogetter() {
		return "rojo";
	}

	@Override
	public void gameIsOver(Linea linea) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ganador(Linea linea) {
		// TODO Auto-generated method stub
		
	}

}
