package classesBasicas;
public class Training extends Activity{
	
	
    public Training(String place) {
        super(place);
    }
    
    public boolean checkBonus(Dragon dragon) {
    	if(this.getPlace().equals("Volcano Land") && dragon.getMagic().equals("Fire")) {
    		return true;
    	}else if(this.getPlace().equals("Sea Of The Brave") && dragon.getMagic().equals("Water")) {
    		return true;
    	}else if(this.getPlace().equals("Lightining Storm") && dragon.getMagic().equals("Lightining")) {
    		return true;
    	}else if(this.getPlace().equals("Ice Island") && dragon.getMagic().equals("Ice")) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public void crossFit(Dragon dragon) {
        int value = (int)(Math.random() * 2);
        if(value == 0) {
            this.setGotHurt(true);
            //porque CrossFit eh horrivel
            value = -5;
        }
        if(this.checkBonus(dragon)) {
        	//This means the Dragon type and the Place of the Activity match
        	value += 3;
        }
        dragon.train(value);
    }
 
    public void upperBody(Dragon dragon) {
        int value = (int)(Math.random() * 10) + 1;
        if(value == 3) {
            this.setGotHurt(true);
            value = -3;
        }
        if(this.checkBonus(dragon)) {
        	//This means the Dragon type and the Place of the Activity match
        	value += 3;
        }
        dragon.train(value);
    }
 
    public void lowerBody(Dragon dragon) {
        int value = (int)(Math.random() * 15) + 1;
        if(value == 5) {
            this.setGotHurt(true);
            value = -3;
        }
        if(this.checkBonus(dragon)) {
        	//This means the Dragon type and the Place of the Activity match
        	value += 3;
        }
        dragon.train(value);
    }
 
    public void fitDance(Dragon dragon) {
        int value = (int)(Math.random() * 20) + 1;
        if(value == 7) {
            this.setGotHurt(true);
            //porque FitDance rules
            value = -3;
        }
        if(this.checkBonus(dragon)) {
        	//This means the Dragon type and the Place of the Activity match
        	value += 3;
        }
        dragon.train(value);
    }
   
    public void fisiotherapy(Dragon dragon) {
        if(this.isGotHurt()) {
            dragon.train(3);
        }
    }
   
}
 