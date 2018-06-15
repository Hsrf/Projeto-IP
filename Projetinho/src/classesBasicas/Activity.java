package classesBasicas;

public abstract class Activity {
	static int constant = 1;
	private int id;
    private String place;
    private boolean gotHurt;
   
    public Activity(String place){
        this.place = place;
        this.gotHurt = false;
        this.id = constant;
        constant++;
    }
    
    public int getId() {
    	return this.id;
    }
    
   
    public boolean isGotHurt() {
        return gotHurt;
    }
 
    public void setGotHurt(boolean gotHurt) {
        this.gotHurt = gotHurt;
    }
   
    public String getPlace() {
        return place;
    }
 
    public void setPlace(String place) {
        this.place = place;
    }
   
}