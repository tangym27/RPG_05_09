public class Slime extends Monster {
	
    public Slime(){
        HP = 50;
        strength = 40 + (int) (Math.random() * 15); 
        defense = 20;
        attackRating = 1;
	System.out.println(toString());

	}
   public String toString(){
	return "You are fighting a slime monster. "+ super.toString();

    }
}

