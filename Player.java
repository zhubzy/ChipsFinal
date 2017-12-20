
public abstract class Player {
	
	String name;
	String nickName;
	
	public Player(String name,String nickName) {
		this.nickName = nickName;
		this.name = name;
	}
	
	public String getNickName() {
		
		
		return nickName;
		
	}
	
	public abstract int getMove(ChipsGame cg);

	

}
