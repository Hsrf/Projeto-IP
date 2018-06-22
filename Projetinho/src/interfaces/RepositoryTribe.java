package interfaces;
import classesBasicas.Tribe;
import excecoes.*;

public interface RepositoryTribe {
	public void inserir(Tribe t);
	public Tribe procurar(String n) throws TriboNaoEncontradaException;
	public void atualizarLider(Viking l) throws MesmoLiderException;
	public void remover(Tribe t) throws TriboNaoEncontradaException;
}