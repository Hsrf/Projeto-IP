package repositorios;

import classesBasicas.Dragon;
import excecoes.DragonAlreadyExistsException;
import excecoes.DragonNotFoundException;
import interfaces.RepositoryDragon;

public class RepositoryListDragon implements RepositoryDragon {

	private Dragon dragon;
	private RepositoryListDragon next;

	public RepositoryListDragon() {
		this.dragon = null;
		this.next = null;
	}

	@Override
	public void insert(Dragon dragon) {
		if (this.dragon == null) {
			this.dragon = dragon;
			this.next = new RepositoryListDragon();
		} else {
			this.next.insert(dragon);
		}

	}

	@Override
	public Dragon search(String name) throws DragonNotFoundException {
		if (exists(name)) {
			if (this.dragon.getName().equals(name)) {
				return this.dragon;
			} else {
				return next.search(name);
			}
		} else {
			throw new DragonNotFoundException(name);
		}
	}

	@Override
	public void update(Dragon dragon, String name) throws DragonNotFoundException, DragonAlreadyExistsException {
		if (exists(dragon.getName()) && !exists(name)) {
			if (this.dragon.getName().equals(dragon.getName())) {
				this.dragon.setName(name);
			} else {
				this.next.update(dragon, name);
			}
		} else if (!exists(dragon.getName())){
			throw new DragonNotFoundException(name);
		} else {
			throw new DragonAlreadyExistsException(name);
		}

	}

	@Override
	public void remove(Dragon dragon) throws DragonNotFoundException {
		if (exists(dragon.getName())) {
			if (this.dragon.getName().equals(dragon.getName())) {
				this.dragon = this.next.dragon;
				this.next = this.next.next;
			} else {
				this.next.remove(dragon);
			}
		} else {
			throw new DragonNotFoundException(dragon.getName());
		}
	}
	
	public boolean exists(String name) {
		if (this.dragon != null) {
			if (this.dragon.getName().equals(name)) {
				return true;
			} else {
				return this.next.exists(name);
			}
		} else {
			return false;
		}
	}
	
	public void autoFill() {
		this.dragon = new Dragon("Blazestone", "Fire");
		this.next = new RepositoryListDragon();
		this.next.dragon = new Dragon("Splashdown", "Water");
		this.next.next = new RepositoryListDragon();
		this.next.next.dragon = new Dragon("Stormicide", "Lightning");
		this.next.next.next = new RepositoryListDragon();
		this.next.next.next.dragon = new Dragon("Frozone","Ice");
		this.next.next.next.next = new RepositoryListDragon();
	}

}
