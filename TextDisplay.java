
public class TextDisplay {

		
		String playerName;
		
		public TextDisplay(String nm) {
			
			playerName = nm;
			System.out.println("Done constructing TextDisplay.");

		}
		
		public void displayMessage(String str) {
			
			System.out.println(str);
			
			
		}
		
		public int getANumberBetween(int lowerBond, int upperBond) {
			
			return (int) (Math.random() * upperBond) + lowerBond;
			
			
		}
		
		
	
	
}
