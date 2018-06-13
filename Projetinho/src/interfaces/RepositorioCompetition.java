package interfaces;
import classesBasicas.Competition;

public interface RepositorioCompetition {
	public void inserir(Competition competition);
	public void procurar(Competition competition);
	public void atualizar(Competition competition);
	public void remover(Competition competition);
}
