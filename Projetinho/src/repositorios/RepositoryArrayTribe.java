package repositorios;

import classesBasicas.Tribe;
import excecoes.*;
import interfaces.RepositoryTribe;

public class RepositoryArrayTribe implements RepositoryTribe {
    
    private Tribe[] arrei;

    public RepositoryArrayTribe () {
        arrei = new Tribe[1];
    }

    public void inserir(Tribe tribo) {
        Tribe[] biggerTribe = new Tribe[this.arrei.length + 1];

        for (int i = 0; i < this.arrei.length; i++) {
            biggerTribe[i] = this.arrei[i];
        }
        biggerTribe[biggerTribe.length - 1] = tribo;
        this.arrei = biggerTribe;
    }

    public void remover(Tribe tribo) throws TriboNaoEcontradaException{
        Tribe[] smallerTribe = new Tribe[this.arrei.length - 1];
        boolean removed = false;

        for (int i = 0; i < smallerTribe.length && !removed; i++) {
            if ((this.arrei[i].getTribe()).equals(tribo.getTribe())) {
                removed = true;
                for (int j = i; j < arrei.length - 1; j++) {
                    arrei[j] = arrei[j + 1];
                }
            }
        }
        for (int i = 0; i < smallerTribe.length; i++) {
            smallerTribe[i] = arrei[i];
        }

        if (removed) {
            this.arrei = smallerTribe;
        } else {
            throw new TriboNaoEncontradaException(tribo.getTribe());
        }
    }

    public Tribe procurar(String name) throws TriboNaoEncontradaException{
        for (int i = 0; i < this.arrei.length; i++) {
            if (name.equals(this.arrei[i].getTribe())) {
                return this.arrei[i];
            }
        }
        
        throw new TriboNaoEncontradaException(name);
    }

    public void atualizarLider(String tribo, Viking lider) throws MesmoLiderException, TriboNaoEncontradaException{
        procurar(tribo).setLeader(lider);
    }
}