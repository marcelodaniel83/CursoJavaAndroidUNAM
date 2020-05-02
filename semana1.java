/*
Genera un código en Java que corra adecuadamente utilizando los bucles y la matriz correctos.
Haz un programa en Java que muestre la siguiente matriz de números:
2   4  6  8
10 12 14 16
18 20 22 24
26 28 30 32

*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;


/**
 *
 * @author TAMURA
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
 int [][] matriz = {{2,4,6,8}, {10, 12, 14,16}, {18,20,22,24}, {26,28,30,32}};
int i,j;
//Uso de length para obtener el número de columnas que tiene cada fila:

for (i = 0; i < matriz.length; i++) {  //cantidad de filas
     for (j = 0; j < matriz[i].length; j++) { //cantidad de columnas de cada fila
          System.out.print(matriz[i][j] + " ");
     }
     System.out.println();
}
         
        
    }
    
}



