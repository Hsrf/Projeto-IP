package excecoes;

public class MesmoLiderException extends Exception{
    public MesmoLiderException(String name) {
        super(name + " ja e o lider desta tribo");
    }
}