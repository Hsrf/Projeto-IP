package excecoes;

public class DragonAlreadyExistsException extends Exception{
	public DragonAlreadyExistsException (String name) {
		super ("O drag�o" + name + "j� existe");
	}
}
