
public class ExternalPlayer extends Player {
	
	public ExternalPlayer(String name, String nickName) {
		
		super(name,nickName);
		
		System.out.println("I am a ExternalPlayer, I will now construct myself as a player would.");
		System.out.println("...searching further in my script for a Player constructor.");
		System.out.println("Done constructing OnesPlayer, " + name);
		
	}

	public int getMove(ChipsGame cg) {
		
		
		return 1;
	}
	
	
	
}
