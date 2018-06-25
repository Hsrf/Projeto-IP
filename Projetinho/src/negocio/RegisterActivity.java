package negocio;

import classesBasicas.Activity;
import excecoes.ActivityAlreadyExistsException;
import excecoes.ActivityNotFoundException;
import interfaces.RepositoryActivity;

public class RegisterActivity {
	
	private RepositoryActivity activities;
	
	public RegisterActivity(RepositoryActivity repo) {
		this.activities = repo;
	}
	
	public void register(Activity activity) throws ActivityAlreadyExistsException {
		if(this.activities.exists(activity.getId())) {
			throw new ActivityAlreadyExistsException(activity.getId());
		}else {
			this.activities.inserir(activity);
		}
	}
	
	public void remove(Activity activity) throws ActivityNotFoundException{
		this.activities.remove(activity);
	}
	public Activity search(int id) throws ActivityNotFoundException{
		return this.activities.search(id);
	}
	
	public void update(Activity activity, String lugar) throws ActivityNotFoundException, ActivityAlreadyExistsException{
		this.activities.update(activity, lugar);
	}
}
