/*
Crea una función "generaArrayAleatorio" que reciba como parámetros el ancho y el largo de una matriz
y éste deberá generarla con números aleatorios comprendidos entre el 1 y el 10.
Crea otra función "muestraArray" que reciba como parámetro un array bidimensional de números enteros y lo muestre por pantalla,
con la salvedad de que al final de cada fila deberá aparecer la suma de los elementos de dicha fila.
Desde la función principal tendrás que hacer una llamada a la función "generaArrayAleatorio" para generar el array bidimensional
y otra llamada a "muestraArray" para mostrar el array con la suma de las filas al final.

 2  7  1 10  7  1  3  1  1  6 -->  39
 10  4  7  7  3  5  6 10 10  1 -->  63
  1  8  3  4  3 10  3  4  5  9 -->  50
  6  4  1  2  4  8  9  3  6  3 -->  46
  2  5  8  4  3  1  3  5  8  1 -->  40
  9  3  5  6  5  6  7 10  2  9 -->  62
  4  9  4  1 10  4  4  7  9  1 -->  53
  5  3  9  9  2 10  5  4  9  7 -->  63
  2  4  5  9  5  6 10  1  3  4 -->  49
  4  1  2  3  3  4  1  4  1  8 -->  31

*/

package sumafilasarrays;

public class SumaFilasArrays {

    //Genero un array bidimensional del tamaña que indican como parámetro las filas y las columnas
    //de números aleatorios entre 1 y 10
    static int[][] generaArrayAleatorio(int filas, int columnas){
        int[][] matriz=new int[filas][columnas];
        int i,j;
        
        for (i=0 ; i < matriz.length ; i++){
            for (j=0 ; j < matriz[i].length ; j++){
                matriz[i][j] = (int)(Math.random()*10+1);
            }
        }
        return matriz;
    }
    
    //Muestro el array bidimensional que pasan como parámetro e imprimo línea por línea
    //y al finalizar cada línea muestra la suma de dicha línea, utilizo para ello una 
    //variable que va sumando los elementos de la fila "sumaFila"
    static void muestraArray(int[][] matriz){
        int i,j,sumaFila=0;
        
        for (i=0; i < matriz.length ; i++){
            for (j=0 ; j < matriz[i].length ; j++){
                sumaFila+=matriz[i][j];
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.printf(" --> %3d\n",sumaFila);
            sumaFila=0;
        }
    }
    
    //Desde la función principal sólo tengo que hacer una llamada para generar el array
    //y otra para mostrarlo por pantalla
    public static void main(String[] args) {
        int[][] matriz;
        
        matriz=generaArrayAleatorio(10,10);
        muestraArray(matriz);
    }
}
