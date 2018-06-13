
public class Competition extends Activity{
    private Dragon[] arrayDragon = new Dragon[10];
   
 
    public Competition(String place) {
        super(place);
    }
 
    public Dragon[] compete(Dragon[] array) {
        Dragon winners[] = new Dragon[3];
       
         for (int i = array.length; i >= 1; i--) {
                for (int j = 1; j < i; j++) {
                    if (array[j - 1].getStrength() > array[j].getStrength()) {
                        Dragon aux = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = aux;
                    }
                }
            }
         
         winners[0] = array[9];
         winners[1] = array[8];
         winners[2] = array[7];
         
        return winners;
    }
}
 