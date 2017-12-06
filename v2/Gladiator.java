public class Gladiator extends Protagonist {

	public Gladiator(String s) {
		super(s);
		baseStrength = (int)(40 + 45 * Math.random());
		attackRating = 0.5;
	      	System.out.println(toString());

	}
       public String toString(){
	return "You are an gladiator. "+ super.toString();

    }

}
