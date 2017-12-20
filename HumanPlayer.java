import java.util.Scanner;

public class HumanPlayer extends Player {

	
	private String name;
	private String nickName;

	
		Scanner scan = new Scanner(System.in);

		public HumanPlayer(String name, String nickname)
		{
			
			super(name,nickname);
			System.out.println("Hello. I will be your computer interface for today. What is your name?");
			name = scan.nextLine();
		}



		public int getMove(ChipsGame chipGame)
		{
			System.out.println("It looks like there are "+ ChipsGame.getPileSize() + " pieces left, and you can take from 1 to "+ ChipsGame.getMaximumMove() +".\nHow many will you take?");
			return scan.nextInt();
		}
	
	
}
