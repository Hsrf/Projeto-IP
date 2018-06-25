package interfaces;
import classesBasicas.Viking;

public interface RepositoryViking {
	public void insert(Viking viking);
	public Viking search (String name);
	public void update(Viking viking, String name);
    public void remove(Viking viking);
    public boolean existsViking (Viking viking);
	public boolean existsName (String name);
}
