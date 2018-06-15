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
	public Dragon search(Dragon dragon) {
		if (this.dragon != null) {
			if (this.dragon.getName().equals(dragon.getName())) {
				return this.dragon;
			} else {
				return next.search(dragon);
			}
		} else {
			return null; // Botar um ngc dizendo que o dragao nao existe
		}
	}

	@Override
	public void update(Dragon dragon, String name) {
		if (this.dragon != null) {
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
		if (this.dragon != null) {
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

}
