package excecoes;

public class VikingNotFoundException extends Exception {
	public VikingNotFoundException (String name) {
		super ("O Viking" + name + "n�o foi encontrado");
	}
}