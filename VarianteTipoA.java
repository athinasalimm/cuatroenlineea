package cuatroEnLinea;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VarianteTipoA extends VarianteTriunfo{
	
	
	


	public VarianteTipoA(Linea linea, char variante) {
		super();

	}
	
	public boolean findVariante(char variante) {
		return variante == 'a';
	}
	

	@Override
	public boolean canWinVertically(Linea linea) { //todo el tiempo se esta llamando esta funcion
		return ((linea.listaDeColumnas.stream().anyMatch(column -> containsFourConsecutiveX(column)) || linea.listaDeColumnas.stream().anyMatch(column -> containsFourConsecutiveY(column))));
	}
	
	private boolean containsFourConsecutiveForVerticalWin(List<String> column, String toFind) {
		String newColumn = String.join("", column);
		return newColumn.contains(toFind);
	}
	/*
	private boolean containsFourConsecutiveX(List<String> column) {
		String newColumn = String.join("", column);
		return newColumn.contains("XXXX");
	}
	
	private boolean containsFourConsecutiveY(List<String> column) {
		String newColumn = String.join("", column);
		return newColumn.contains("YYYY");
	}	*/
	
	public boolean canWin(Linea linea) {
		return ((canWinVertically(linea) || canWinHorizontally(linea)));
	}
	
	public boolean canWinHorizontally(Linea linea) { //todo el tiempo se esta llamando esta funcion
		return ((containsFourConsecutiveForHorizontalWin(linea, "X") || containsFourConsecutiveForHorizontalWin(linea, "Y")));
	}
	
	public static boolean containsFourConsecutiveForHorizontalWin(Linea linea, String toFind) {
	    for(int i = 0; i < linea.listaDeColumnas.size(); i ++) {
	        List<String> column = linea.listaDeColumnas.get(i);
	        String row = column.get(i);
	        return row.contains(toFind);
	    }
		return false; 
	    }
	/*
	public static boolean containsFourConsecutiveXX(Linea linea) {
	    for(int i = 0; i < linea.listaDeColumnas.size(); i ++) {
	        List<String> column = linea.listaDeColumnas.get(i);
	        String row = column.get(i);
	        return row.contains("XXXX");
	    }
		return false; 
	    }
	    
		
		public static boolean containsFourConsecutiveYY(Linea linea) {
		    for(int i = 0; i < linea.listaDeColumnas.size(); i ++) {
		        List<String> column = linea.listaDeColumnas.get(i);
		        String row = column.get(i);
		        return row.contains("YYYY");
		    }
			return false;
		}
*/
	
		public boolean canWinDiagonally(Linea linea) {
			return false;
		}
		
		/*public static boolean containsFourConsecutiveYY(Linea linea) {
			for(int i = 0; i < linea.listaDeColumnas.size(); i ++) {
				String newFila = String.join("", linea.listaDeColumnas.get(i).get(i));
				return newFila.contains("YYYY");
				
			}
		
				
				
		    Stream<String> streamConVacios = Stream.generate(() -> " ").limit(linea.listaDeColumnas.size());

		    String ganadorHorizontal = linea.listaDeColumnas.stream()
		            .flatMap(lista -> Stream.concat(lista.stream().limit(1), streamConVacios))
		            .collect(Collectors.joining(" "));
		    return ganadorHorizontal;
		
		/*
		
	    Stream<String> streamConVacios = Stream.generate(() -> " ").limit(linea.listaDeColumnas.size());

	    String ganadorHorizontal = linea.listaDeColumnas.stream()
	            .flatMap(lista -> Stream.concat(lista.stream().limit(1), streamConVacios))
	            .collect(Collectors.joining(" "));
	    return ganadorHorizontal;
		
		
		/*
        String ganadorHorizontal =  
        		linea.listaDeColumnas.stream().flatMap(lista -> lista.stream().findFirst().map(Stream::of)
        		.orElse(Stream.of(" ")))
                .collect(Collectors.joining(" "));
    }*/
	
	
	
		
		/*Stream<String> stream = linea.list
		
		linea.listaDeColumnas.stream().filter(colorRojo -> "X".equals(colorRojo)).collect(Collectors.toList());
		result.forEach()
		
		for(int i = 0; i < linea.listaDeColumnas.size(); i++ ) {
			if (linea.listaDeColumnas.get(i).stream().
					linea.listaDeColumnas.get(columna)
		return false;
	}*/
	

}
