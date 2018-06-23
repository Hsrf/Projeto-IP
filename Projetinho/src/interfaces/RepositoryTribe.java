package interfaces;
import classesBasicas.Tribe;
import classesBasicas.Lider;
import excecoes.*;

public interface RepositoryTribe {
	public void inserir(Tribe tribo);
	public Tribe procurar(String nome) throws TriboNaoEncontradaException;
	public void atualizarLider(String tribo, Lider lider) throws MesmoLiderException, TriboNaoEncontradaException;
	public void remover(Tribe tribo) throws TriboNaoEncontradaException;
	public boolean existe(String nome);
}