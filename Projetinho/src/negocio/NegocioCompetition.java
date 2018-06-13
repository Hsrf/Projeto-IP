package negocio;

import interfaces.RepositorioCompetition;
import repositorios.RepositorioArrayCompetition;
import repositorios.RepositorioListaCompetition;

public class NegocioCompetition {
	
	private RepositorioCompetition repositorio;
	
	public NegocioCompetition() {
		boolean x = false;
		if (x/*array*/) {
			this.repositorio = new RepositorioArrayCompetition();
		}else if(x/*lista*/){
			this.repositorio = new RepositorioListaCompetition();
		}
	}
}
