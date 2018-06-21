package repositorios;

import classesBasicas.Activity;
import interfaces.RepositoryActivity;


public class RepositoryArrayActivity implements RepositoryActivity{
	
	private Activity[] array;

	public RepositoryArrayActivity(){
		this.array = new Activity[1];
	}


	@Override
	public void inserir(Activity activity) {
		Activity[] bigger;
		bigger = new Activity[this.array.length + 1];
		for(int i = 0; i < array.length; i++) {
			bigger[i] = this.array[i];
		}
		bigger[bigger.length - 1] = activity;
		this.array = bigger;
	}



	@Override
	public void remove(Activity activity) {
		Activity[] smaller;
		smaller = new Activity[this.array.length -1];
		for(int i = 0; i < array.length; i++) {
			if(array[i].getId() == activity.getId()) {
				for(int j = i; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
			}
		}
		for(int i = 0; i < smaller.length; i++) {
			smaller[i] = array[i];
		}

		this.array = smaller;	
	}

	

	@Override
	public void update(Activity activity, String place) {
		boolean updated = false;
		for(int i = 0; i < array.length && updated == false; i++) {
			if(this.array[i].getId() == activity.getId()) {
				this.array[i].setPlace(place);
				updated = true;
			}
		}
		if(!updated) {
			//throw exception Actividade inexistente
		}
	}

	@Override
	public Activity search(int id) {
		for(int i = 0; i < array.length; i++) {
			if(this.array[i].getId() == id) {
				return this.array[i];
			}
		}
		return null;
	}
}
