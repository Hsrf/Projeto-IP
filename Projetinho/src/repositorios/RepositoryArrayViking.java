package repositorios;

import classesBasicas.Viking;
import interfaces.RepositoryViking;

public class RepositoryArrayViking implements RepositoryViking {

	private Viking[] arrayViking;

	RepositoryArrayViking() {
		arrayViking = new Viking[0];
	}

	@Override
	public void insert(Viking viking) {
		Viking[] arrayVikingBigger = new Viking[this.arrayViking.length + 1];
		for (int i = 0; i < this.arrayViking.length; i++) {
			arrayVikingBigger[i] = this.arrayViking[i];
		}
		arrayVikingBigger[this.arrayViking.length] = viking;
		this.arrayViking = arrayVikingBigger;
	}

	@Override
	public Viking search(String name) {
		if (existsName(name)) {
			for (int i = 0; i < this.arrayViking.length; i++) {
				if (this.arrayViking[i].getName().equals(name)) {
					return arrayViking[i];
				}
			}
		} else {
			return null; //mensagem falando q n existe esse viking
		}

	}

	@Override
	public void update(Viking viking, String name) {
		boolean found = false;
		if (existsName(name)) {
			for (int i = 0; i < this.arrayViking.length && !found; i++) {
				if (this.arrayViking[i].getName().equals(viking.getName())) {
					found = true;
					this.arrayViking[i].setName(name);
				}
			}
		} else {
			// mensagem falando que nao existe esse viking
		}
	}

	@Override
	public void remove(Viking viking) {
		boolean removed = false;
		if (existsViking(viking)) {
			Viking[] arrayVikingSmaller = new Viking[this.arrayViking.length - 1];
			for (int i = 0; i < this.arrayViking.length; i++) {
				if (this.arrayViking[i].getName().equals(viking.getName())) {
					removed = true;
				} else if (!removed) {
					arrayVikingSmaller[i] = this.arrayViking[i];
				} else {
					arrayVikingSmaller[i - 1] = this.arrayViking[i];
				}
			}
			this.arrayViking = arrayVikingSmaller;
		} else {
			// mensagem falando q nao existe viking
		}
	}

	public boolean existsViking(Viking viking) {
		boolean exists = false;
		for (int i = 0; i < arrayViking.length && !exists; i++) {
			if (this.arrayViking[i].equals(viking.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			return false;
		} else {
			return true;
		}
	}

	public boolean existsName(String name) {
		boolean exists = false;
		for (int i = 0; i < arrayViking.length && !exists; i++) {
			if (this.arrayViking[i].equals(name)) {
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
