package interfaces;
import classesBasicas.Competition;
import classesBasicas.Dragon;

public interface RepositoryDragon {
	public void insert(Dragon dragon);
	public Dragon search (String name);
	public void update(Dragon dragon, String name);
	public void remove(Dragon dragon);
	public boolean existsDragon (Dragon dragon);
	public boolean existsName (String name);
}
