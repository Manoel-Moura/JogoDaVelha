package velha;



import java.util.Scanner;


public class Jogada
{
	static Scanner teclado = new Scanner(System.in);
	static int x,y,z;
	
	
	static void coletaDados(String simbolo) 
	{
		x = teclado.nextInt();
		y = teclado.nextInt();
		if(validaEntrada(x,y))
		{
			if(validaJogada(x,y))
			{
				z++;
				//System.out.println("Jogada Valida!");
				 
			}
		
		}
		else
		{
			 System.err.println("\nJogada Invalida!");
		}
		
	}
	public static boolean validaEntrada(int x, int y)
	  {
		  if(x <= 2 && x >=0 && y <=2 && y >=0)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
	  
	 public static boolean validaJogada(int x, int y)
	  {
		  if(Tabuleiro.jogada[x][y].equals(" "))
		  { 
			  
			  Tabuleiro.jogada[x][y] = Jogador.jogador(z);
			  return true;
		  }
		  else
		  {
			  System.err.println("\nJogada Invalida!");
			  return false;
		  }
	  }
  
  
  
}
