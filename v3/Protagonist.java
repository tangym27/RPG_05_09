public abstract class Protagonist extends Character {
    protected String name;
    protected int baseDefense;
    protected int baseStrength;

    public Protagonist(String s) {
    	// base stats
        name = s;
        HP = 250;
        baseStrength = strength = (int)(20 + 45 * Math.random());
        baseDefense = defense = 40;
        attackRating = 0.4;
	//	System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void specialize() {
		defense -= 5;
		strength += 15;
     }

    public void normalize() {
		defense = baseDefense;
		strength = baseStrength;
    }
    public abstract String toString();
}
