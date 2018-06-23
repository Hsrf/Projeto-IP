package repositorios;

import classesBasicas.Activity;
import classesBasicas.Competition;
import classesBasicas.Training;
import interfaces.RepositoryActivity;


public class RepositoryArrayActivity implements RepositoryActivity{
	
	private Activity[] array;

	public RepositoryArrayActivity(){
		array = new Activity[20];
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

	@Override
	public void autoFill() {
		this.array[0] = new Competition("Volcano Land");
		this.array[1] = new Competition("Sea Of The Brave");
		this.array[2] = new Competition("Lightining Storm");
		this.array[3] = new Competition("Ice Island");
		this.array[4] = new Training("Volcano Land");
		this.array[5] = new Training("Sea Of The Brave");
		this.array[6] = new Training("Lightining Storm");
		this.array[7] = new Training("Ice Island");
		this.array[8] = new Competition("CIn");
		this.array[9] = new Training("CIn");
	}
}
