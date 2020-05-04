/*Programa que genera una matriz representando un triángulo invertido alineado a la derecha realizado con asteriscos, 
cuyo tamaño será especificado por el usuario. La matriz será mostrada en pantalla finalmente. 
Por ejemplo, si se indica el tamaño 5 deberá aparecer:

*****
****
***
**
* 

*/

public static void main(String[] args) {
        final int TAM = 5;
        char[][] triangulo = new char[TAM][TAM];
 
        //Cargar matriz con el dibujo
        for(int f=0; f<TAM; f++) {
            //Bucle para mostrar espacios
            for(int c=0; c<f; c++)
                triangulo[f][c] = ' ';
            //Bucle para mostrar asteriscos
            for(int c=f; c<TAM; c++)
                triangulo[f][c] = '*';
        }
 
        //Mostrar matriz en pantalla
        for(int f=0; f<TAM; f++) {
            for(int c=0; c<TAM; c++)
                System.out.print(triangulo[f][c]);
            System.out.println();
        }
    }
