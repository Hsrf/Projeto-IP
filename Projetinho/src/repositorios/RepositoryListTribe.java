package repositorios;

import classesBasicas.Tribe;
import interfaces.RepositoryTribe;

public class RepositoryListTribe implements RepositoryTribe {

    private Tribe tribo;
    private RepositoryListTribe next;

    public RepositoryListTribe() {
        this.tribo = null;
        this.next = null; 
    }

    public void inserir (Tribe tribo) {
        if (this.tribo == null) {
            this.tribo = tribo;
            this.next = new RepositoryListTribe();
        } else {
            this.next.inserir(tribo);
        }
    }

    public Tribe procurar (String name) {
        if (name.equals(this.tribo.getTribe())) {
            return this.tribo;
        } else {
            return this.next.procurar(name);
        }
    }

    public void remover (Tribe tribo) {
        if (this.tribo.getName().equals(tribo.getTribe())) {
            this.tribo = this.next.tribo;
            this.next = this.next.next;
        } else {
            this.next.remover(tribo);
        }
    }

    public void atualizarLider (Viking lider) {
        this.tribo.setLeader(lider);
    }
}