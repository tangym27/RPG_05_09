/*public class Protagonist extends Character {
	private String name;
        private double originalAtk; // useful in normalize
	private int originalDef; // useful in normalize

 	// private int damage; 
	
	public Protagonist(String cname){
		name = cname;
		HP = 100;
		strength = 100;
		defense = 40;
		attackRating = 0.4;
		originalDef = 50; // useful in normalize
		originalAtk = 1; //useful in normalize
	}


	public String getName() {
		return name;
	}

  
    
  }
  
  public void normalize() {
    defense = originalDef;
    attackRating = originalAtk;
  }
  }*/

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
