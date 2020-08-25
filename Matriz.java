public class Matriz {
  public static void main (String[] args)
{
	int numero = 0;
	int matriz [][] = new int [4][4];
	
	for (int i=0;i<4;i++)
	{
		numero += 2;
		matriz[i][0] = numero;
		numero += 2;
		matriz[i][1] = numero;
		numero += 2;
		matriz[i][2] = numero;
		numero += 2;
		matriz[i][3] = numero;
	}

	for (int j=0;j<4;j++)
	{
		System.out.print(matriz[j][0]+" ");
		System.out.print(matriz[j][1]+" ");
		System.out.print(matriz[j][2]+" ");
		System.out.println(matriz[j][3]+" ");
	}
}

}
