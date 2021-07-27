package velha;



public class Tabuleiro 
{
	static String[][] jogada = {{" "," "," "},{" "," "," "},{" "," "," "}};
	static int i,j;
	
	static void  imprimeJogada()
	{
		System.out.println("0 | 1| 2\n");
		for (i = 0 ; i < jogada.length ; i++)
		{
			for(j = 0 ; j < jogada[i].length;j++)
			{
				if(j == 1 || j == 2)
				{
					System.out.print("|");
				}
				System.out.print(jogada[i][j] + " ");
				
			}
			System.out.print("\n");
		}
	}
	static void limpartabuleiro()
	{
		for (i = 0 ; i < jogada.length ; i++)
		{
			for(j = 0 ; j < jogada[i].length;j++)
			{
				jogada[i][j] = " ";
			}
		}
		Jogada.z = 0;
	}
}
