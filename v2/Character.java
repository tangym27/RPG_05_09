public class Character {
  protected int HP;
  protected int strength;
  protected int defense;
  protected double attackRating;

  public boolean isAlive() {
    return HP > 0;
  }

  protected int getDefense() {
    return defense;
  }

  protected void lowerHP(int loss) {
    HP = HP- loss;
  }

	protected int attack(Character monster) {
	    int damage = 0;
	    if (isAlive() && ((strength * attackRating) - defense) > 0) {
		damage = (int) ((strength * attackRating) - monster.getDefense());
	    }
	    monster.lowerHP(damage);
	    return damage; 
	}
  
}
