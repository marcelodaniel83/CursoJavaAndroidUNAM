//Introduccion a arreglos bidimensionales, llenado e impresion del mismo con for anidados en Java.
public class ArregloBidimencional {
    public static void main(String[] args) {
        //Creamos Arreglo
        int arreglo[][] = new int[2][3];
        for (int n = 0; n < arreglo.length;n++) //Columnas
            for(int i = 0;i < arreglo[0].length;i++) //Filas
                arreglo[n][i]= i;
              
        //Mostramos el arreglo
        for (int n = 0; n < arreglo.length;n++) //Columnas
            for(int i = 0;i < arreglo[0].length;i++) //Filas
                System.out.println(arreglo[n][i]);
