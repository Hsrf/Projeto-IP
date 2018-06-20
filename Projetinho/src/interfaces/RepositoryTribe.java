package interfaces;
import classesBasicas.Tribe;

public interface RepositoryTribe {
	public void inserir(Tribe t);
	public Tribe procurar(String n);
	public void atualizarLider(Viking l);
	public void remover(Tribe t);
}