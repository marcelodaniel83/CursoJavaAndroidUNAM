/*
Crear un array bidimensional de tamaño 7x7 y rellénalo de forma que los elementos de la diagonal principal sean 1 y el resto 0.
Muéstra el array por pantalla en forma de cuadrado.
Nota. Consideramos la diagonal principal la que empieza arriba a la izquierda y termina abajo a la derecha.

[1, 0, 0, 0, 0, 0, 0]
[0, 1, 0, 0, 0, 0, 0]
[0, 0, 1, 0, 0, 0, 0]
[0, 0, 0, 1, 0, 0, 0]
[0, 0, 0, 0, 1, 0, 0]
[0, 0, 0, 0, 0, 1, 0]
[0, 0, 0, 0, 0, 0, 1]
*/

package diagonalprincipal;

import java.util.Arrays;

public class DiagonalPrincipal {

    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        int f;
        
        //Relleno la diagonal principal con 1
        //Solo tengo que recorrer las casillas en las que el número de fila es
        //igual que el número de columna:  matriz[0][0]=matriz[1][1]...=matriz[6][6]=1
        for (f=0 ; f < matriz.length ; f++){
            matriz[f][f]=1;                           
        }
        
        //Muestro las filas de la matriz haciendo uso de la libreria "Arrays"
        for (f=0 ; f < matriz.length ; f++){
            System.out.println(Arrays.toString(matriz[f]));
        }
    }
}
