package excecoes;

public class ActivityAlreadyExistsException extends Exception{
	public ActivityAlreadyExistsException (int id) {
		super ("A atividade de código: "+ id + " já existe!");
	}
}
