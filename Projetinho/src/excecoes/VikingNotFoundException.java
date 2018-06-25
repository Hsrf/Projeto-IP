package excecoes;

public class VikingNotFoundException extends Exception {
	public VikingNotFoundException (String name) {
		super ("O Viking" + name + "não foi encontrado");
	}
}