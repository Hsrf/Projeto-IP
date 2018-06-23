package negocio;

import interfaces.RepositoryActivity;
import repositorios.RepositoryArrayActivity;
import repositorios.RepositoryListActivity;

public class NegocioActivity {
	
	private RepositoryActivity repository;
	
	public NegocioActivity() {
		boolean x = false;
		if (x/*array*/) {
			this.repository = new RepositoryArrayActivity();
		}else /*lista*/{
			this.repository = new RepositoryListActivity();
		}
	}
}
