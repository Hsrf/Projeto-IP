package repositorios;

import classesBasicas.Activity;
import interfaces.RepositoryActivity;

public class RepositoryListaActivity implements RepositoryActivity{

	private Activity activity;
	private RepositoryListaActivity next;

	public RepositoryListaActivity() {
		this.activity = null;
		this.next = null;
	}

	@Override
	public void inserir(Activity activity) {
		if(this.activity == null) {
			this.activity = activity;
			this.next = new RepositoryListaActivity();
		}else {
			this.next.inserir(activity);
		}
	}


	@Override
	public Activity search(Activity activity) {
		if(this.activity.getId() == activity.getId()) {
			return activity;
		}else if(this.activity == null) {
			//throw exception Actividade não existe;
			return null;
		}else {
			return this.next.search(activity) ;
		}
	}


	@Override
	public void update(Activity activity, String place) {
		if(this.activity.getId() == activity.getId()) {
			this.activity.setPlace(place);
		}else if(this.next != null){
			this.next.update(activity, place);	
		}else {
			//throw exception Atividade não existente
		}
	}


	@Override
	public void remove(Activity activity) {
		if(this.activity.getId() == activity.getId()) {
			this.activity = this.next.activity;
			this.next = this.next.next;
		}else {
			this.next.remove(activity);
		}
	}

}
