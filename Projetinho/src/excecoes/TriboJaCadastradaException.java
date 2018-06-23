package excecoes;

public class TriboJaCadastradaException extends Exception {
	public TriboJaCadastradaException(String nome) {
        super("A tribo " + nome + " ja foi cadastrada");
    }
}