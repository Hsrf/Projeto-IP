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
	
	public void train(String place, int number) {
		//o numer(que varia de 1 a 5), é o tipo de treinamento desejado
		this.training = new Training(place);
		if(number == 1) {
			training.crossFit(this.dragon);
		}else if(number == 2) {
			training.upperBody(this.dragon);
		}else if(number == 3) {
			training.lowerBody(this.dragon);
		}else if(number == 4) {
			training.fitDance(this.dragon);
		}else if(number == 5) {
			training.fisiotherapy(this.dragon);
		}
	}
}
