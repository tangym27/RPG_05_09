public class Gladiator extends Protagonist {

	public Gladiator(String s) {
		super(s);
		baseStrength = (int)(40 + 45 * Math.random());
		attackRating = 0.5;
	}

}
