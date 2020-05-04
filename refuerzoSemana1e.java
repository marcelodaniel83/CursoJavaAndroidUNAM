//recorriendo por columnas y filas. Matriz de dos dimensiones.

public class RecorrerMatrizPorColumnasYFilas {
	public static void main(String[] args) {
		int[][] matriz = new int[50][100]; // Matriz de números enteros que supondremos llena.
						   // 50 filas y 100 columnas.
	
		for (int i = 0; i < 100; i++)		// El primer índice recorre las columnas.
			for (int j = 0; j < 50; j++){	// El segundo índice recorre las filas.
				// Procesamos cada elemento de la matriz.
				System.out.println(matriz[j][i]);	// ¡Índices cambiados de orden!
			}
	}
}
