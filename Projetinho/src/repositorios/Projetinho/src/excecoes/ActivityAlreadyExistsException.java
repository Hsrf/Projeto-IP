package excecoes;

public class ActivityAlreadyExistsException extends Exception{
	public ActivityAlreadyExistsException (int id) {
		super ("A atividade de c�digo: "+ id + " j� existe!");
	}
}
