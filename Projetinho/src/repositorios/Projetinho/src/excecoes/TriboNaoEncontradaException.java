package excecoes;

public class TriboNaoEncontradaException extends Exception {
	public TriboNaoEncontradaException(String nome) {
        super("A tribo " + nome + " nao foi encontrada");
    }
}