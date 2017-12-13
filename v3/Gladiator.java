public class Gladiator extends Protagonist {

	public Gladiator(String s) {
		super(s);
		baseStrength = (int)(40 + 45 * Math.random());
		attackRating = 0.5;
	}
	
    public String toString(){
    	return "You are an gladiator. "+ System.lineSeparator() +
		"Your stats are as follows: \n" +
		"HP: " + HP + "\n" + 
		"STR: " + strength + "\n" +
		"DEF: " + defense + "\n" +
		"Attack Multiplier: " + attackRating;
    }
}
