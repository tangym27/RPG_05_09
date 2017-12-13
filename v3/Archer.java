public class Archer extends Protagonist {

	public Archer(String s) {
		super(s);
		attackRating = 0.7;
	}
	
    public void specialize() {
		defense -= 5;
		strength += 25;
     }

    public String toString(){
    	return "You are an archer. "+ System.lineSeparator() +
		"Your stats are as follows: \n" +
		"HP: " + HP + "\n" + 
		"STR: " + strength + "\n" +
		"DEF: " + defense + "\n" +
		"Attack Multiplier: " + attackRating;
    }
}
