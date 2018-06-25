package negocio;

import classesBasicas.Tribe;
import classesBasicas.Leader;
import excecoes.*;
import interfaces.RepositoryTribe;

public class CadastroTribe {

    private RepositoryTribe tribos;

    public CadastroTribe (RepositoryTribe repo) {
        this.tribos = repo;
    }

    public void cadastar (Tribe tribo) throws TriboJaCadastradaException{
        if (this.tribos.existe(tribo.getTribe())) {
            throw new TriboJaCadastradaException(tribo.getTribe());
        } else {
            this.tribos.inserir(tribo);
        }
    }

    public void remover (Tribe tribo) throws TriboNaoEncontradaException{
        this.tribos.remover(tribo);
    }

    public Tribe procurar (String name) throws TriboNaoEncontradaException{
        return this.tribos.procurar(name);
    }

    public void atualizarLider(String tribo, Leader lider) throws MesmoLiderException, TriboNaoEncontradaException{
        this.tribos.atualizarLider(tribo, lider);
    }
}