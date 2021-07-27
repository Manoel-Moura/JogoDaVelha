package velha;



public class Resultado 
{
	static boolean vencedor()
	{ 
		
		if(Tabuleiro.jogada[0][0].equals("X") && Tabuleiro.jogada[0][1].equals("X") && Tabuleiro.jogada[0][2].equals("X") || Tabuleiro.jogada[0][0].equals("O") && Tabuleiro.jogada[0][1].equals("O") && Tabuleiro.jogada[0][2].equals("O") )
		{
			System.out.println("\nJogador " + Jogador.njogador + " ganhou!");
			Ranking.vitoria(Jogador.njogador);
			Ranking.placar();
			Tabuleiro.limpartabuleiro();
			return true;
		}
		else if(Tabuleiro.jogada[1][0].equals("X") && Tabuleiro.jogada[1][1].equals("X") && Tabuleiro.jogada[1][2].equals("X") || Tabuleiro.jogada[1][0].equals("O") && Tabuleiro.jogada[1][1].equals("O") && Tabuleiro.jogada[1][2].equals("O"))
		{
			System.out.println("\nJogador " + Jogador.njogador + " ganhou!");
			Ranking.vitoria(Jogador.njogador);
			Ranking.placar();
			Tabuleiro.limpartabuleiro();
			return true;
		}
		else if(Tabuleiro.jogada[2][0].equals("X") && Tabuleiro.jogada[2][1].equals("X") && Tabuleiro.jogada[2][2].equals("X") || Tabuleiro.jogada[2][0].equals("O") && Tabuleiro.jogada[2][1].equals("O") && Tabuleiro.jogada[2][2].equals("O") )
		{
			System.out.println("\nJogador " + Jogador.njogador + " ganhou!");
			Ranking.vitoria(Jogador.njogador);
			Ranking.placar();
			Tabuleiro.limpartabuleiro();
			return true;
		}
		else if(Tabuleiro.jogada[0][0].equals("X") && Tabuleiro.jogada[1][0].equals("X") && Tabuleiro.jogada[2][0].equals("X") || Tabuleiro.jogada[0][0].equals("O") && Tabuleiro.jogada[1][0].equals("O") && Tabuleiro.jogada[2][0].equals("O") )
		{
			System.out.println("\nJogador " + Jogador.njogador + " ganhou!");
			Ranking.vitoria(Jogador.njogador);
			Ranking.placar();
			Tabuleiro.limpartabuleiro();
			return true;
		}
		else if(Tabuleiro.jogada[0][1].equals("X") && Tabuleiro.jogada[1][1].equals("X") && Tabuleiro.jogada[2][1].equals("X") || Tabuleiro.jogada[0][1].equals("O") && Tabuleiro.jogada[1][1].equals("O") && Tabuleiro.jogada[2][1].equals("O") )
		{
			System.out.println("\nJogador " + Jogador.njogador + " ganhou!");
			Ranking.vitoria(Jogador.njogador);
			Ranking.placar();
			Tabuleiro.limpartabuleiro();
			return true;
		}
		else if(Tabuleiro.jogada[0][2].equals("X") && Tabuleiro.jogada[1][2].equals("X") && Tabuleiro.jogada[2][2].equals("X") || Tabuleiro.jogada[0][2].equals("O") && Tabuleiro.jogada[1][2].equals("O") && Tabuleiro.jogada[2][2].equals("O") )
		{
			System.out.println("\nJogador " + Jogador.njogador + " ganhou!");
			Ranking.vitoria(Jogador.njogador);
			Ranking.placar();
			Tabuleiro.limpartabuleiro();
			return true;
		}
		
		else if(Tabuleiro.jogada[0][0].equals("X") && Tabuleiro.jogada[1][1].equals("X") && Tabuleiro.jogada[2][2].equals("X") || Tabuleiro.jogada[0][0].equals("O") && Tabuleiro.jogada[1][1].equals("O") && Tabuleiro.jogada[2][2].equals("O"))
		{
			System.out.println("\nJogador " + Jogador.njogador + " ganhou!");
			Ranking.vitoria(Jogador.njogador);
			Ranking.placar();
			Tabuleiro.limpartabuleiro();
			return true;
		}
		else if(Tabuleiro.jogada[0][2].equals("X") && Tabuleiro.jogada[1][1].equals("X") && Tabuleiro.jogada[2][0].equals("X") || Tabuleiro.jogada[0][2].equals("O") && Tabuleiro.jogada[1][1].equals("O") && Tabuleiro.jogada[2][0].equals("O"))
		{
			System.out.println("\nJogador " + Jogador.njogador + " ganhou!");
			Ranking.vitoria(Jogador.njogador);
			Ranking.placar();
			Tabuleiro.limpartabuleiro();
			return true;
		}
		else if(Jogada.z == 9)
		{
			System.out.println("\nDeu velha");
			Ranking.vitoria(3);
			Ranking.placar();
			Tabuleiro.limpartabuleiro();
			return true;
		}
		return false;
	}

}
