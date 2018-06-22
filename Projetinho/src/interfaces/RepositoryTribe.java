package interfaces;
import classesBasicas.Tribe;
import excecoes.*;

public interface RepositoryTribe {
	public void inserir(Tribe tribo);
	public Tribe procurar(String nome) throws TriboNaoEncontradaException;
	public void atualizarLider(String tribo, Viking lider) throws MesmoLiderException, TriboNaoEncontradaException;
	public void remover(Tribe tribo) throws TriboNaoEncontradaException;
}