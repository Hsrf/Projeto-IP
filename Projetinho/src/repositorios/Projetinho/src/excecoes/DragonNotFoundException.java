package excecoes;

import classesBasicas.Dragon;

public class DragonNotFoundException extends Exception {
	public DragonNotFoundException (String name) {
		super ("O drag�o" + name + "n�o foi encontrado");
	}
}
