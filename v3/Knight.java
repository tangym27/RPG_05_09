public class Knight extends Protagonist {

	public Knight(String s) {
		super(s);
		HP = 300;
		baseDefense = defense = 55;
	}
	
    public String toString(){
    	return "You are an knight. "+ System.lineSeparator() +
		"Your stats are as follows: \n" +
		"HP: " + HP + "\n" + 
		"STR: " + strength + "\n" +
		"DEF: " + defense + "\n" +
		"Attack Multiplier: " + attackRating;
    }
}
