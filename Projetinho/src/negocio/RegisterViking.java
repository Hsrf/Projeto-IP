package negocio;

import classesBasicas.Dragon;
import classesBasicas.Viking;
import excecoes.ActivityAlreadyExistsException;
import excecoes.DragonAlreadyExistsException;
import excecoes.DragonNotFoundException;
import excecoes.VikingAlreadyExistsException;
import excecoes.VikingNotFoundException;
import interfaces.RepositoryViking;

public class RegisterViking {

	private RepositoryViking vikings;
	
	public RegisterViking(RepositoryViking repo) {
		this.vikings = repo;
	}
	
	public void insert (Viking viking) throws VikingAlreadyExistsException {
		if(this.vikings.existsName(viking.getName())) {
			throw new VikingAlreadyExistsException(viking.getName());
		}else {
			this.vikings.insert(viking);
		}
	}
	
	public void remove (Viking viking) throws VikingNotFoundException {
		this.vikings.remove(viking);
	}
	
	public Viking search (String name) throws VikingNotFoundException {
		return this.vikings.search(name);
	}
	
	public void update (Viking viking, String name) throws VikingNotFoundException, VikingAlreadyExistsException {
		this.vikings.update(viking, name);
	}
}
