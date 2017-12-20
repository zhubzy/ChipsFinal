
public class ChipsGameDriver {

	public static void main (String args[]) {
		
		String onesPlayerName = "Jun";
		String randomPlayerName = "Ricky";
		String chipsGamePlayerName = "Zach";
		String textDisplayPlayerName = "Stephany";
		
		
		System.out.println(onesPlayerName + ", construct yourself as a OnesPlayer, your nickname is George");
		OnesPlayer jun = new OnesPlayer(onesPlayerName,"George");
			
		System.out.println(randomPlayerName + ", construct yourself as a RandomPlayer, your nickname is Martha");
		RandomPlayer ricky = new RandomPlayer(randomPlayerName,"Martha");
		
		System.out.println(textDisplayPlayerName + ", construct yourself as a TextDisplay");
		TextDisplay stephany = new TextDisplay(textDisplayPlayerName);
		
		Player players[] = {jun, new HumanPlayer("Zach", "zzy")};
		
		
		System.out.println(chipsGamePlayerName + ", construct yourself as a ChipsGame, you have seven chips");
		ChipsGame zach = new ChipsGame(7, stephany, players);
		
		
		
		
		zach.play();
		System.out.println("Done playing Chips");
	}
}
