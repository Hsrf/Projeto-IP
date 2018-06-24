package excecoes;

import classesBasicas.Dragon;

public class DragonNotFoundException extends Exception {
	public DragonNotFoundException (String name) {
		super ("O dragão" + name + "não foi encontrado");
	}
}
