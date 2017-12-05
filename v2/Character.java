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

  protected int attack(Character target) {
    int damage = (int)(strength * attackRating) - target.getDefense();
    if (damage < 0) {
    	damage = 0;
    }
    target.lowerHP(damage);
    return damage; 
  } 
}
