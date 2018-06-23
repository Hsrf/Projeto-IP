package repositorios;

import classesBasicas.Activity;
import classesBasicas.Competition;
import classesBasicas.Training;
import interfaces.RepositoryActivity;

public class RepositoryListActivity implements RepositoryActivity{

	private Activity activity;
	private RepositoryListActivity next;

	public RepositoryListActivity() {
		this.activity = null;
		this.next = null;
	}

	@Override
	public void inserir(Activity activity) {
		if(this.activity == null) {
			this.activity = activity;
			this.next = new RepositoryListActivity();
		}else {
			this.next.inserir(activity);
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

	@Override
	public Activity search(int id) {
		if(this.activity.getId() == activity.getId()) {
			return activity;
		}else if(this.activity == null) {
			//throw exception Actividade não existe;
			return null;
		}else {
			return this.next.search(id) ;
		}
	}

	@Override
	public void autoFill() {
		this.inserir(new Competition("Volcano Land"));
		this.inserir(new Competition("Sea Of The Brave"));
		this.inserir(new Competition("Lightining Storm"));
		this.inserir(new Competition("Ice Island"));
		this.inserir(new Training("Volcano Land"));
		this.inserir(new Training("Sea Of The Brave"));
		this.inserir(new Training("Lightining Storm"));
		this.inserir(new Training("Ice Island"));
		this.inserir(new Competition("CIn"));
		this.inserir(new Training("CIn"));
	}
}
