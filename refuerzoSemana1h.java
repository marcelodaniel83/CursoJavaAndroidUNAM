/*
Crea un array de 10 elementos con números aleatorios del 1 al 100 y muéstralo por pantalla.
Ahora tendrás que llamar a una función "separaParesImpares" que devolverá otro array ordenado de la siguiente forma: 
primero aparecerán todos los pares y después todos los impares. 
Finalmente muestra el array ordenado por pantalla.

Array Inicial:
5, 9, 18, 50, 49, 67, 2, 99, 97, 20

Array Ordenado:
18, 50, 2, 20, 5, 9, 49, 67, 99, 97

*/

package paresimpares;

import java.util.Arrays;

public class ParesImpares {

    static int[] separaParesImpares(int[] lista){
        int[] nuevo=new int[lista.length];
        int i, posicionNuevoIzq=0, posicionNuevoDer=lista.length-1;
        
        //Hago un recorrido para colocar primero los pares en el nuevo array
        //y al final del array los impares
        for (i=0;i < lista.length;i++){
            if (lista[i]%2==0){
                nuevo[posicionNuevoIzq]=lista[i];
                posicionNuevoIzq++;
            } else {
                nuevo[posicionNuevoDer]=lista[i];
                posicionNuevoDer--;
            }                
        }
        return nuevo;
    }
    
    public static void main(String[] args) {
        int[] elementos=new int[10];
        int i;
        
        //Genero el array con números aleatorios del 1 al 100
        for (i=0;i < elementos.length;i++){
            elementos[i]=(int)(Math.random()*100+1);
        }
        System.out.println("Array antes de ordenar pares e impares: "+Arrays.toString(elementos));
        //Hago la llamada a la función que separa pares e impares y el resultado lo guardo
        //en el mismo array
        elementos=separaParesImpares(elementos);
        System.out.println("Array después de ordenar pares e impares: "+Arrays.toString(elementos));        
    }
}

