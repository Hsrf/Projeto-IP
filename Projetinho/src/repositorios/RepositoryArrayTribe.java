package repositorios;

import classesBasicas.Tribe;
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

    public void remover(Tribe tribo) {
        Tribe[] smallerTribe = new Tribe[this.arrei.length - 1];

        for (int i = 0; i < smallerTribe.length; i++) {
            if ((this.arrei[i].getTribe()).equals(tribo.getTribe())) {
                for (int j = i; j < arrei.length - 1; j++) {
                    arrei[j] = arrei[j + 1];
                }
            }
        }
        for (int i = 0; i < smallerTribe.length; i++) {
            smallerTribe[i] = arrei[i];
        }

        this.arrei = smallerTribe;
    }

    public Tribe procurar(String name) {
        for (int i = 0; i < this.arrei.length; i++) {
            if (name.equals(this.arrei[i].getTribe())) {
                return this.arrei[i];
            }
        }
    }

    public void atualizarLider(Viking lider) {
        for (int i = 0; i < this.arrei.length; i++) {
            if ((this.arrei[i].getLeader()).equals(lider.getName())) {
                this.arrei.setLeader(lider);
            }
        }
    }
}