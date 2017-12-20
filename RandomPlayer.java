
public class RandomPlayer extends Player {

	public RandomPlayer(String name, String nickName) {
		
		super(name,nickName);
		
		System.out.println("I am a RandomPlayer, I will now construct myself as a player would.");
		System.out.println("...searching further in my script for a Player constructor.");
		System.out.println("Done constructing RandomPlayer, " + name);
		
	}

	public int getMove(ChipsGame cg) {
		
		int maxMove = ChipsGame.getMaximumMove();
		System.out.println("I will now choose a number betwen 1 and " + maxMove);
		int randNum =  (int) (Math.random() * maxMove) + 1;
		System.out.println(randNum);
		return randNum;
	
	}
	
	

}
