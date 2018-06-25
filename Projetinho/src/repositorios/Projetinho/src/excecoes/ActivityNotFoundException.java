package excecoes;

public class ActivityNotFoundException extends Exception{
	public ActivityNotFoundException (int id) {
		super ("A atividade de código: "+ id +" não foi encontrada!");
	}
}
