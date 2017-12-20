
public class ChipsGame {

	private static int maximumMove;
	private static TextDisplay display;
	private Player[] players;
	private static int pileSize;
	
	private int currentPlayerIndex;
	private int lastMove;
	
	public ChipsGame(int size, TextDisplay ds, Player[] players) {
		
		pileSize = size;
		display = ds;
		this.players = players;
		currentPlayerIndex = 0;
		maximumMove = pileSize - 1;
		
		//-1 means not set
		lastMove = -1;
		
		
		
	}
	
	

	public void play() {
		
		display.displayMessage("Welcome");
		
	
		
		
		
		
		
		while (pileSize > 0) {
			
			if (lastMove != -1){
				maximumMove = lastMove * 2;
			}
			if (maximumMove > pileSize) {
				
				maximumMove = pileSize;
			}
			
			
			lastMove = players[currentPlayerIndex].getMove(this);
			String name = players[currentPlayerIndex].getNickName();
			display.displayMessage(name + " removes " + lastMove + " chips.");
			pileSize -= lastMove;
			
			
			
			if (currentPlayerIndex < players.length - 1) {
				currentPlayerIndex++;
			} else {
				
				currentPlayerIndex = 0;
				
			}
		
		} 
		
		

			if (currentPlayerIndex == 0) {
				
				System.out.println(players[players.length-1].nickName + " wins!");

			} else {
				
				
				System.out.println(players[--currentPlayerIndex].nickName + " wins!");
	
			}
		
		
		
	}
		
	public static int getMaximumMove() {
		
		return maximumMove;
		
		
	}
	
	public static int getPileSize() {
		
		return pileSize;
		
	}
	
	public static void show() {
		
		display.displayMessage("The pile currently holds " + pileSize + " chips");
		display.displayMessage("The current maximum move is " + maximumMove);
		
	}
		
		
		
		
	
	
	
	
	
}
