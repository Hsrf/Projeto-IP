package repositorios;
import classesBasicas.Dragon;
import interfaces.RepositoryDragon;

public class RepositoryArrayDragon implements RepositoryDragon {
	
	private Dragon[] arrayDragon;
	
	RepositoryArrayDragon() {
		arrayDragon = new Dragon[0];
	}
	
	@Override
	public void insert(Dragon dragon) {
		Dragon[] arrayDragonBigger = new Dragon[arrayDragon.length + 1];
		for (int i = 0; i < arrayDragon.length; i++) {
			arrayDragonBigger[i] = arrayDragon[i];
		}
		arrayDragonBigger[arrayDragon.length] = dragon;
	}

	@Override
	public Dragon search (Dragon dragon) {
		for (int i = 0; i < arrayDragon.length; i++) {
			if (arrayDragon[i].getName().equals(dragon.getName())) {
				return arrayDragon[i];
			} //AINDA NAO TERMINEI!!!!!!!!
		}
		
	}

	@Override
	public void update(Dragon dragon, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Dragon dragon) {
		// TODO Auto-generated method stub
		
	}

}
