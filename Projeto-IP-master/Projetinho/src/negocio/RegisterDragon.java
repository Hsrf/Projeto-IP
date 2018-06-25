package negocio;

import classesBasicas.Dragon;
import excecoes.DragonAlreadyExistsException;
import excecoes.DragonNotFoundException;
import interfaces.RepositoryDragon;

public class RegisterDragon {
	
	private RepositoryDragon dragons;
	
	public RegisterDragon(RepositoryDragon repo) {
		this.dragons = repo;
	}
	
	public void register (Dragon dragon) throws DragonAlreadyExistsException {
		if(this.dragons.exists(dragon.getName())) {
			throw new DragonAlreadyExistsException(dragon.getName());
		} else {
			this.dragons.insert(dragon);
		}
	}
	
	public void remove (Dragon dragon) throws DragonNotFoundException {
		this.dragons.remove(dragon);
	}
	
	public Dragon search (String name) throws DragonNotFoundException {
		return this.dragons.search(name);
	}
	
	public void update (Dragon dragon, String name) throws DragonNotFoundException, DragonAlreadyExistsException {
		this.dragons.update(dragon, name);
	}
	
}
