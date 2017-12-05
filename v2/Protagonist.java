public class Protagonist extends Character {
    private String name;

    public Protagonist(String s) {
        name = s;
        HP = 250;
        strength = (int)(20 + 45 * Math.random());
        defense = 40;
        attackRating = 0.4;
    }

    public String getName() {
        return name;
    }

    public void specialize() {
		defense -= 5;
		attackRating += 0.5;
     }

    public void normalize() {
		defense = 75;
		attackRating = 0.4;
    }
}
