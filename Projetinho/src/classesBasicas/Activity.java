package classesBasicas;

public abstract class Activity {
 
    private String place;
    private boolean gotHurt;
   
    public Activity(String place){
        this.place = place;
        this.gotHurt = false;
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