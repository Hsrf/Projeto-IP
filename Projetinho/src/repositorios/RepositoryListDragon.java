package repositorios;

import classesBasicas.Dragon;
import interfaces.RepositoryDragon;

public class RepositoryListDragon implements RepositoryDragon {

	private Dragon dragon;
	private RepositoryListDragon next;

	RepositoryListDragon() {
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
	public Dragon search(String name) {
		if (existsName(name)) {
			if (this.dragon.getName().equals(name)) {
				return this.dragon;
			} else {
				return next.search(name);
			}
		} else {
			return null; // Botar um ngc dizendo que o dragao nao existe
		}
	}

	@Override
	public void update(Dragon dragon, String name) {
		if (existsDragon(dragon)) {
			if (this.dragon.getName().equals(dragon.getName())) {
				this.dragon.setName(name);
			} else {
				this.next.update(dragon, name);
			}
		} else {
			// throws excecao de dragao q nao existe
		}

	}

	@Override
	public void remove(Dragon dragon) {
		if (existsDragon(dragon)) {
			if (this.dragon.getName().equals(dragon.getName())) {
				this.dragon = this.next.dragon;
				this.next = this.next.next;
			} else {
				this.next.remove(dragon);
			}
		} else {
			// throws excecao de dragao q nao existe
		}
	}
	
	public boolean existsDragon(Dragon dragon) {
		if (this.dragon != null) {
			if (this.dragon.getName().equals(dragon.getName())) {
				return true;
			} else {
				return this.next.existsDragon(dragon);
			}
		} else {
			return false;
		}
	}
	
	public boolean existsName(String name) {
		if (this.dragon != null) {
			if (this.dragon.getName().equals(name)) {
				return true;
			} else {
				return this.next.existsName(name);
			}
		} else {
			return false;
		}
	}

}
