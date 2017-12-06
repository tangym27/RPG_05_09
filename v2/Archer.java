public class Archer extends Protagonist {

	public Archer(String s) {
		super(s);
		attackRating = 0.7;
	}
	
    public void specialize() {
		defense -= 5;
		strength += 25;
     }
}
