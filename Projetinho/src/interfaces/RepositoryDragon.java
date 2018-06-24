package interfaces;
import classesBasicas.Dragon;
import excecoes.DragonAlreadyExistsException;
import excecoes.DragonNotFoundException;

public interface RepositoryDragon {
	public void insert(Dragon dragon);
	public Dragon search (String name) throws DragonNotFoundException;
	public void update(Dragon dragon, String name) throws DragonNotFoundException, DragonAlreadyExistsException;
	public void remove(Dragon dragon) throws DragonNotFoundException;
	public boolean exists (String name);
}
