package excecoes;

public class DragonAlreadyExistsException extends Exception{
	public DragonAlreadyExistsException (String name) {
		super ("O dragão" + name + "já existe");
	}
}
