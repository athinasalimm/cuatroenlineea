package cuatroEnLinea;

public class TurnoAzul extends Estado {

	public TurnoAzul(Linea game) {
		super(game);
	}

	public void moveBlue(int columna) {
		linea.moverfichita(columna, 'O', new TurnoRojo(linea));

	}

	public void moveRed(int columna) {
		throw new RuntimeException("No es el turno de rojo");
	}
	
	public String turnogetter() {
		return "azul";
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

// HAY DOS ESTADOS Q TIENEN Q VER CON TURNO, EL JUEGO LONEA HABLA CON TODOS ESTOS ESTADOS SIEMPRE EN LOS MISMOS TERMINOS, SE VA FIJANDO Q SEA TURNO.