package repositorios;

import classesBasicas.Dragon;
import excecoes.DragonAlreadyExistsException;
import excecoes.DragonNotFoundException;
import interfaces.RepositoryDragon;

public class RepositoryArrayDragon implements RepositoryDragon {

	private Dragon[] arrayDragon;

	RepositoryArrayDragon() {
		arrayDragon = new Dragon[0];
	}

	@Override
	public void insert(Dragon dragon) {
		Dragon[] arrayDragonBigger = new Dragon[this.arrayDragon.length + 1];
		for (int i = 0; i < this.arrayDragon.length; i++) {
			arrayDragonBigger[i] = this.arrayDragon[i];
		}
		arrayDragonBigger[this.arrayDragon.length] = dragon;
		this.arrayDragon = arrayDragonBigger;
	}

	@Override
	public Dragon search(String name) throws DragonNotFoundException {
		if (exists(name)) {
			for (int i = 0; i < this.arrayDragon.length; i++) {
				if (this.arrayDragon[i].getName().equals(name)) {
					return arrayDragon[i];
				}
			}
		} else {
			throw new DragonNotFoundException(name);
		}

	}

	@Override
	public void update(Dragon dragon, String name) throws DragonNotFoundException, DragonAlreadyExistsException {
		boolean found = false;
		if (exists(dragon.getName()) && !exists(name)) {
			for (int i = 0; i < this.arrayDragon.length && !found; i++) {
				if (this.arrayDragon[i].getName().equals(dragon.getName())) {
					found = true;
					this.arrayDragon[i].setName(name);
				}
			}
		} else if (!exists(dragon.getName())) {
			throw new DragonNotFoundException(dragon.getName());
		} else {
			throw new DragonAlreadyExistsException(name);
		}
	}

	@Override
	public void remove(Dragon dragon) throws DragonNotFoundException {
		boolean removed = false;
		if (exists(dragon.getName())) {
			Dragon[] arrayDragonSmaller = new Dragon[this.arrayDragon.length - 1];
			for (int i = 0; i < this.arrayDragon.length; i++) {
				if (this.arrayDragon[i].getName().equals(dragon.getName())) {
					removed = true;
				} else if (!removed) {
					arrayDragonSmaller[i] = this.arrayDragon[i];
				} else {
					arrayDragonSmaller[i - 1] = this.arrayDragon[i];
				}
			}
			this.arrayDragon = arrayDragonSmaller;
		} else {
			throw new DragonNotFoundException(dragon.getName());
		}
	}

	public boolean exists (String name) {
		boolean exists = false;
		for (int i = 0; i < arrayDragon.length && !exists; i++) {
			if (this.arrayDragon[i].equals(name)) {
				exists = true;
			}
		}
		if (!exists) {
			return false;
		} else {
			return true;
		}
	}
	
	public void autoFill() {
		this.arrayDragon[0] = new Dragon("Blazestone", "Fire");
		this.arrayDragon[1] = new Dragon("Splashdown", "Water");
		this.arrayDragon[2] = new Dragon("Stormicide", "Lightning");
		this.arrayDragon[3] = new Dragon("Frozone","Ice");
	}

}
