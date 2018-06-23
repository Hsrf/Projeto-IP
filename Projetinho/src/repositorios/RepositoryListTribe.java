package repositorios;

import classesBasicas.Tribe;
import excecoes.*;
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

    public void atualizarLider (String tribo, Viking lider) throws MesmoLiderException, TriboNaoEncontradaException{
        procurar(tribo).setLeader(lider);
    }

    public boolean existe(String tribe) {
        if (this.tribo.getTribe().equals(tribe)) {
            return true;
        } else if (this.next != null) {
            return this.next.existe(tribe);
        } else {
            return false;
        }
    }
}