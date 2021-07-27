package velha;



import java.util.Scanner;

public class Partida 
{
	static void partida()
	{
	int i,x;
	do {
		
		System.out.println("============================================");
		System.out.println("              JOGO DA VELHA                 ");
		System.out.println("Novo jogo         	(1)");
		System.out.println("Finalizar partida 	(0)");
		System.out.println("============================================");
		System.out.print("Digite sua op��o: ");
		Scanner teclado = new Scanner(System.in);
		x = teclado.nextInt();
		System.out.print("\n");
		
		
		if(x == 1) 
		{
			Tabuleiro.imprimeJogada();
			do {
			    System.out.print("\nJogador ["+ Jogador.jogador(Jogada.z) +"] sua vez! ");
				Jogada.coletaDados(Jogador.jogador(Jogada.z));
				 System.out.println("");
				Tabuleiro.imprimeJogada();
					if(Resultado.vencedor())
					{
						
						break;
					}
			    i = Jogada.z;
			}while( i < 10 );
		}
		else if(x != 0) 
		{
			System.err.println("\nEntrada invalida!\nTente novamente!");
		}
		
	 }while(x != 0);
	
	Ranking.placar();
}

}
