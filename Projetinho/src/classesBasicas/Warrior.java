package classesBasicas;

public class Warrior extends Viking {
    private Dragon dragon;
    private Training training;
    
	Warrior(String name, Tribe tribe, Dragon dragon) {
		super(name, tribe);
		this.dragon = dragon;
		this.training = null;
	}
	
	public String getDragonName () {
		return dragon.getName();
	}
	
	public void setDragon(Dragon dragon) {
		this.dragon = dragon;
	}
	
	public Training train(String place) {
		this.training = new Training(place, this.dragon);
		return this.training;
	}
}
