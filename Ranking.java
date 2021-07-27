package velha;



public class Ranking 
{
	static int jogador1;
	static int jogador2;
    static	int velha;
	
	
	static void vitoria(int vencedor)
	{
		if(vencedor == 1)
		{
			jogador1 += 1;
		}
		else if(vencedor == 2)
		{
			jogador2 += 1;
		}
		else
		{
			velha += 1;
		}
	}
	static void placar()
	{
		if(jogador1 > jogador2)
		{
			System.out.println("\n\n1� - [X] com " + jogador1 + " vitoria[s].\n"+ "2� - [O] com " + jogador2 +" vitoria[s].\n"+  "Empates: "  + velha   );
		}

		else if(jogador1 < jogador2)
		{
			System.out.println("\n\n1� - [O] com " + jogador2 + " vitoria[s].\n"+ "2� - [X] com " + jogador1 +" vitoria[s].\n"+ "Empates: "  + velha );
		}
		else if(jogador1 == jogador2)
		{
			System.out.println("\n\n[X] e [O] est�o empatados com "+ jogador1 +" vitoria[s].\n" + "Empates: "  + velha );
		}
		
	}

}
