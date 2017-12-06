public class Monster extends Character {
	
	public Monster(){
		HP = 150;
		strength = 20+ (int) (Math.random() * 45); 
		defense = 20;
		attackRating = 1;
	}
	     public String toString(){
       return "The monster's stats (ordered by HP, strength, defense and attackRating) are as follows \n" + HP + "\n"+ strength + "\n"+ defense + "\n"+ attackRating;
    }
   
	 
}

