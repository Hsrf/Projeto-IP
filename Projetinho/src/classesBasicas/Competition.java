package classesBasicas;

public class Competition extends Activity{
    private Dragon[] arrayDragon = new Dragon[10];
    
    public Competition(String place) {
        super(place);
    }           
   
    
  
    public void addDragon(Dragon dragon) { 
    	boolean added = false;
    	if(!checkDragon(dragon)) {
    	for(int i = 0; i < 10 && !added ; i++) {
    		if(arrayDragon[i] == null) {
    			added = true;
    			arrayDragon[i] = dragon;
    			}
    		}
    	}else {
    		// criar a excecao para dragao ja na competicao
    	}
    }
    
    public boolean checkDragon(Dragon dragon) {
    	
    	for(int j = 0; j < 10; j++) {
    		if(arrayDragon[j] == dragon) {
    			return true;
    		}
    	}
    	return false;
    }
 
    public Dragon[] compete() {
        Dragon winners[] = new Dragon[3];
       
         for (int i = arrayDragon.length; i >= 1; i--) {
                for (int j = 1; j < i; j++) {
                    if (arrayDragon[j - 1].getStrength() > arrayDragon[j].getStrength()) {
                        Dragon aux = arrayDragon[j];
                        arrayDragon[j] = arrayDragon[j - 1];
                        arrayDragon[j - 1] = aux;
                    }
                }
            }
         
         winners[0] = arrayDragon[9];
         winners[1] = arrayDragon[8];
         winners[2] = arrayDragon[7];
         
        return winners;
    }
}
 