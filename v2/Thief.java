public class Thief extends Monster {
	
    public Thief(){
        HP = 175;
        strength = 55 + (int) (Math.random() * 25); 
        defense = 45;
        attackRating = 1;
       	System.out.println(toString());

    }
       public String toString(){
	return "You are fighting a thief monster. "+ super.toString();

    }

}

