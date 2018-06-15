package classesBasicas;
public class Training extends Activity{
	
	
    public Training(String place, Dragon dragon) {
        super(place);
    }
    
    
  
 
    public void crossFit(Dragon dragon) {
        int value = (int)(Math.random() * 2);
        if(value == 0) {
            this.setGotHurt(true);
            //porque CrossFit eh horrivel
            value = -5;
        }
        dragon.train(value);
    }
 
    public void upperBody(Dragon dragon) {
        int value = (int)(Math.random() * 10) + 1;
        if(value == 3) {
            this.setGotHurt(true);
            value = -3;
        }
        dragon.train(value);
    }
 
    public void lowerBody(Dragon dragon) {
        int value = (int)(Math.random() * 15) + 1;
        if(value == 5) {
            this.setGotHurt(true);
            value = -3;
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
        dragon.train(value);
    }
   
    public void fisiotherapy(Dragon dragon) {
        if(this.isGotHurt()) {
            dragon.train(3);
        }
    }
   
}
 