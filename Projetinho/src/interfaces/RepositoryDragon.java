package interfaces;
import classesBasicas.Competition;
import classesBasicas.Dragon;

public interface RepositoryDragon {
	public void insert(Dragon dragon);
	public Dragon search (Dragon dragon);
	public void update(Dragon dragon, String name);
	public void remove(Dragon dragon);
}
