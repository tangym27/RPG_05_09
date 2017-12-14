/*.\ Errors:
 * Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
 * YoRPG.java:19: error: Protagonist is abstract; cannot be instantiated
 * .\Knight.java:1: error: Knight is not abstract and does not override abstract method toString() in Protagonist
 */

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

    public abstract void specialize();

    public abstract void normalize();
    
    public abstract String toString();
}
