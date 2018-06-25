package repositorios;

import classesBasicas.Viking;
import interfaces.RepositoryViking;

public class RepositoryListViking implements RepositoryViking {

	private Viking viking;
	private RepositoryListViking next;

	public RepositoryListViking() {
		this.viking = null;
		this.next = null;
	}

	@Override
	public void insert(Viking viking) {
		if (this.viking == null) {
			this.viking = viking;
			this.next = new RepositoryListViking();
		} else {
			this.next.insert(viking);
		}

	}

	@Override
	public Viking search(String name) {
		if (existsName(name)) {
			if (this.viking.getName().equals(name)) {
				return this.viking;
			} else {
				return next.search(name);
			}
		} else {
			return null; // Botar um ngc dizendo que o viking nao existe
		}
	}

	@Override
	public void update(Viking viking, String name) {
		if (existsViking(viking)) {
			if (this.viking.getName().equals(viking.getName())) {
				this.viking.setName(name);
			} else {
				this.next.update(viking, name);
			}
		} else {
			// throws excecao de viking q nao existe
		}

	}

	@Override
	public void remove(Viking viking) {
		if (existsViking(viking)) {
			if (this.viking.getName().equals(viking.getName())) {
				this.viking = this.next.viking;
				this.next = this.next.next;
			} else {
				this.next.remove(viking);
			}
		} else {
			// throws excecao de viking q nao existe
		}
	}
	
	public boolean existsViking(Viking viking) {
		if (this.viking != null) {
			if (this.viking.getName().equals(viking.getName())) {
				return true;
			} else {
				return this.next.existsViking(viking);
			}
		} else {
			return false;
		}
	}
	
	public boolean existsName(String name) {
		if (this.viking != null) {
			if (this.viking.getName().equals(name)) {
				return true;
			} else {
				return this.next.existsName(name);
			}
		} else {
			return false;
		}
	}

}
