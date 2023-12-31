package cuatroEnLinea;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Linea {
	public static String NoSePuedeAgregarOtraFicha = "No se puede agregar otra ficha, se llego al limite"; //TERMINA EL JUEGO
	public int altura;
	private int base;
	private char variante;
	public Estado turno;
	public static List<List> listaDeColumnas;
	public boolean juegoTerminado;
	public String ganador;

	public Linea(int base, int altura, char variante) {
		this.altura = altura;
		this.base = base;
		this.variante = variante;
		listaDeColumnas = new ArrayList();
		turno = new TurnoRojo(this);
		juegoTerminado = false;
		ganador = "Aun no hay ganador";
	}

	public int getLargo() {
		return base;
	}

	public int getAltura() {
		return altura;
	}
	public char getVariante() {
		return variante;
	}

	public void setTurno(Estado turno) {
		this.turno = turno;
	}

	public String getTurno() {
		return turno.turnogetter();
	}
	public String getGanador() {
		return ganador;
	}
	
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	
		/*
		private Game playRedkAt(int columna){
			if
		}*/
	public List<List> crearTablero() {
		
		for (int i = 0; i < base; i++) {
			listaDeColumnas.add(new ArrayList());
		}
		return listaDeColumnas;
	}

	public void playRedkAt(int columnaElegida) {
		turno.moveRed(columnaElegida);
	}
	
	
	
	public void playBlueAt(int columnaElegida) {
		turno.moveBlue(columnaElegida);
	}
	
	/*public Linea play(int columna) {
		player.play(this , columna);
		return this;
	}*/


	
	
	public char[][] show() {
	    char[][] board = new char[base][altura];
	    for (int i = 0; i < base; i++) {   //HACER ESTO CON STREAMS
	        for (int j = 0; j < altura; j++) {
	            board[i][j] = '|';
	        }
	    }
	    for (int i = 0; i < base; i++) {
	        List<String> column = listaDeColumnas.get(i);
	        for (int j = 0; j < column.size(); j++) { //FORS CON STREAMS
	            Object piece = column.get(j);
	            
	            // ver 
	            if (piece instanceof Character) {
	                char charPiece = (char) piece;
	                if (charPiece == 'X') {
	                    board[i][j] = 'X';
	                } else if (charPiece == 'O') {
	                    board[i][j] = 'O';
	            }
	        }
	    }
	    }
	    return board;
	    
	}

	public boolean finished() {
		return juegoTerminado;
	}

	
	public void moverfichita(int columnaElegida, char caracterAIngresar, Estado turnoASetear) {
		if(listaDeColumnas.get(columnaElegida - 1).size() < altura) {
			listaDeColumnas.get(columnaElegida - 1).add(caracterAIngresar);  //ACA EL -1 ARREGLA LO DE Q LA GENTE SI PONE COLUMNA 1 SE REFIERE A LO Q SERIA LA LISTA 0
		}
		else {
			throw new RuntimeException (NoSePuedeAgregarOtraFicha);
		}
		setTurno(turnoASetear);  
	}
	
	public void hayempate() {
		for(int i = 0; i < altura; i++ ) {
			if(listaDeColumnas.get(i).size()  == (altura -1)){ //ESTE ES EL FOR Q SE FIJA 
				juegoTerminado = true;
			}
		}
	}
	
	public boolean canWinVertically() { 
		return ((listaDeColumnas.stream().anyMatch(column -> containsFourConsecutiveForVerticalWin(column, "XXXX")) || listaDeColumnas.stream().anyMatch(column -> containsFourConsecutiveForVerticalWin(column, "YYYY"))));
	}
	
	private boolean containsFourConsecutiveForVerticalWin(List<String> column, String toFind) {
		String newColumn = String.join("", column);
		return newColumn.contains(toFind);
	}
	
	public boolean canWinHorizontally() { //todo el tiempo se esta llamando esta funcion
		return ((containsFourConsecutiveForHorizontalWin("XXXX") || containsFourConsecutiveForHorizontalWin("YYYY")));
	}
	
	public static boolean containsFourConsecutiveForHorizontalWin(String toFind) {
	    for(int i = 0; i < listaDeColumnas.size(); i ++) {
	        List<String> column = listaDeColumnas.get(i);
	        String row = column.get(i);
	        return row.contains(toFind);
	    }
		return false; 
	    }
	




}
	


