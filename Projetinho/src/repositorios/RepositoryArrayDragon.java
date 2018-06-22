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
		Dragon[] arrayDragonBigger = new Dragon[this.arrayDragon.length + 1];
		for (int i = 0; i < this.arrayDragon.length; i++) {
			arrayDragonBigger[i] = this.arrayDragon[i];
		}
		arrayDragonBigger[this.arrayDragon.length] = dragon;
		this.arrayDragon = arrayDragonBigger;
	}

	@Override
	public Dragon search(String name) {
		if (existsName(name)) {
			for (int i = 0; i < this.arrayDragon.length; i++) {
				if (this.arrayDragon[i].getName().equals(name)) {
					return arrayDragon[i];
				}
			}
		} else {
			return null; //mensagem falando q n existe esse dragon
		}

	}

	@Override
	public void update(Dragon dragon, String name) {
		boolean found = false;
		if (existsDragon(dragon)) {
			for (int i = 0; i < this.arrayDragon.length && !found; i++) {
				if (this.arrayDragon[i].getName().equals(dragon.getName())) {
					found = true;
					this.arrayDragon[i].setName(name);
				}
			}
		} else {
			// mensagem falando que nao existe esse dragon
		}
	}

	@Override
	public void remove(Dragon dragon) {
		boolean removed = false;
		if (existsDragon(dragon)) {
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
			// mensae=gem falando q nao existe dragao
		}
	}

	public boolean existsDragon(Dragon dragon) {
		boolean exists = false;
		for (int i = 0; i < arrayDragon.length && !exists; i++) {
			if (this.arrayDragon[i].equals(dragon.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			return false;
		} else {
			return true;
		}
	}

	public boolean existsName(Dragon name) {
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

}
