package excecoes;

public class VikingAlreadyExistsException extends Exception {
	public VikingAlreadyExistsException (String name) {
		super ("O Viking" + name + "já existe");
	}
}