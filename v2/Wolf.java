public class Wolf extends Monster {
	
    public Wolf(){
        HP = 125;
        strength = 50 + (int) (Math.random() * 15); 
        defense = 30;
        attackRating = 1;
    }
    
    public String toString(){
    	return "You are fighting a wolf monster. "+ super.toString();
    }
}

