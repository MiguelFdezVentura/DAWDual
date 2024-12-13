package tema4.game;
import pio.daw.catalog.game.*;
import pio.daw.catalog.game.GameUtil.GameOptions;
import java.util.Random;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub random.nextInt(maxGoles + 1)
		Random random = new Random();
		int rand1;
		int rand2;
		int jugador1 = 0;
		int jugador2 = 0;
		for(int i = 1; i<=10; i++) {
			System.out.println("\nJugada " + i + ": ");
			rand1 = random.nextInt(3);
			rand2= random.nextInt(3);
			try {
				int iRes = GameUtil.rockPaperScissors(Jugada(rand1),Jugada(rand2));
				switch(iRes)
				{
				case 0:
					System.out.println("Empate");
				case 1:
					System.out.println("Gana Jugador1");
					jugador1++;
				case 2:
					System.out.println("Pierde Jugador1");
					jugador2++;
				default:
					System.out.println("Error Jugada no valida. ");

				}
			} catch (GameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static GameOptions Jugada(int num) {
		switch(num)
		{
		case 0:
			System.out.println("Rock"); 
			return GameOptions.rock;
		case 1:
			System.out.println("Paper");
			return GameOptions.paper;
		case 2:
			System.out.println("Scissors");
			return GameOptions.scissors;
		default:
			System.out.println("Error Jugada no valida. ");
			return null;
		}
	}
}
