package repositorios;

import classesBasicas.Tribe;
import excecoes.TriboNaoEncontradaException;
import interfaces.RepositoryTribe;
import excecoes.*;

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

    public Tribe procurar (String name) throws TriboNaoEncontradaException{
        if (this.tribo == null) {
            throw new TriboNaoEncontradaException(name);
        } else {
            if (name.equals(this.tribo.getTribe())) {
                return this.tribo;
            } else {
                return this.next.procurar(name);
            }
        }
    }

    public void remover (Tribe tribo) throws TriboNaoEncontradaException{
        if (this.tribo == null) {
            throw new TriboNaoEncontradaException(tribo.getName());
        } else {
            if (this.tribo.getName().equals(tribo.getTribe())) {
                this.tribo = this.next.tribo;
                this.next = this.next.next;
            } else {
                this.next.remover(tribo);
            }
        }
    }

    public void atualizarLider (Viking lider) throws MesmoLiderException{
        this.tribo.setLeader(lider);
    }
}