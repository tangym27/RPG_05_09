public class Archer extends Protagonist {

	public Archer(String s) {
		super(s);
		attackRating = 0.7;
		System.out.println(toString());
	}
	
    public void specialize() {
		defense -= 5;
		strength += 20;
     }

    public String toString(){
	return "You are an archer. "+ super.toString();

    }
}
