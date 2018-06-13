package comoTreinarDragao;

public class Warrior extends Viking {
    private Dragon dragon;
    
	Warrior(String name, Tribe tribe, Dragon dragon) {
		super(name, tribe);
		this.dragon = dragon;
	}
	
	public String getDragonName () {
		return dragon.getName();
	}
	
	public void setDragon(Dragon dragon) {
		this.dragon = dragon;
	}
	
}
