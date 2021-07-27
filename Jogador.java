package velha;



public class Jogador 
{
	static String simbolo;
	static int njogador;

	static String jogador(int x)
	{
		simbolo = (x % 2 == 0) ? "X" : "O";
		numeroJogador();
		return simbolo;
	}
	static private void numeroJogador()
	{
		njogador = (simbolo.equals("X")) ? 1 : 2;
	}
}
