/*
Arrays multidimensionales:
Que salga en pantalla estos números:
2 7 9 
3 6 1 
7 4 2

*/

class multiDimensional
{
    public static void main(String args[])
    {
        // declarar e inicializar array 2D
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
 
        // imprimir array 2D
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr[i][j] + " ");
 
            System.out.println();
        }
    }
