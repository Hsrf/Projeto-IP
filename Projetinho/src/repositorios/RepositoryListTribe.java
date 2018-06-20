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

    public void inserir (Tribe t) {
        if (this.tribo == null) {
            this.tribo = t;
            this.next = new RepositoryListTribe();
        } else {
            this.next.inserir(t);
        }
    }

    public Tribe procurar (String n) {
        if (n.equals(this.tribo.getTribe())) {
            return this.tribo;
        } else {
            return this.next.procurar(n);
        }
    }

    public void remover (Tribe t) {
        if (this.tribo == t) {
            this.tribo = this.next.tribo;
            this.next = this.next.next;
        } else {
            this.next.remover(t);
        }
    }

    public void atualizarLider (Viking l) {
        this.tribo.setLeader(l);
    }
}