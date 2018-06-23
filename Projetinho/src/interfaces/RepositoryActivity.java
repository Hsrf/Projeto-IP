package interfaces;
import classesBasicas.Activity;


public interface RepositoryActivity {
	public void inserir(Activity activity);
	public void remove(Activity activity);
	public Activity search(int id);
	public void update(Activity activity, String lugar);
	public void autoFill();
}
