package excecoes;

public class ActivityNotFoundException extends Exception{
	public ActivityNotFoundException (int id) {
		super ("A atividade de c�digo: "+ id +" n�o foi encontrada!");
	}
}
