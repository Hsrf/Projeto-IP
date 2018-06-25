package fachada;

import classesBasicas.*;
import excecoes.*;
import interfaces.RepositoryDragon;
import interfaces.RepositoryTribe;
import negocio.*;

public class Fachada {
    private CadastroTribe cadastroTribo;
    private RegisterDragon cadastroDragao;
    // classe negocio de hugo
    // classe negocio de luana

    public Fachada (RepositoryTribe repositorioTribo, RepositoryDragon repositorioDragao /* hugo e luana */) {
        this.cadastroTribo = new RepositoryTribe(repositorioTribo);
        this.cadastroDragao = new RepositoryDragon(repositorioDragao);
        // hugo
        // luana
    }

    // métodos de Tribo
    public void cadastrarTribo(Tribe tribo) throws TriboJaCadastradaException{
        this.cadastroTribo.cadastar(tribo);
    }

    public void removerTribo(Tribe tribo) throws TriboNaoEncontradaException{
        this.cadastroTribo.remover(tribo);
    }

    public Tribe procurarTribo(String nome) throws TriboNaoEncontradaException{
        return this.cadastroTribo.procurar(nome);
    }

    public void atualizarLider(String tribo, Lider lider) throws MesmoLiderException, TriboNaoEncontradaException{
        this.cadastroTribo.atualizarLider(tribo, lider);
    }


    // métodos de Dragão
    public void registrarDragao(Dragon dragon) throws DragonAlreadyExistsException{
        this.cadastroDragao.register(dragon);
    }

    public void removerDragao(Dragon dragon) throws DragonNotFoundException{
        this.cadastroDragao.remove(dragon);
    }

    public Dragon procurarDragao(String name) throws DragonNotFoundException{
        return this.cadastroDragao.search(name);
    }

    public void atualizarDragao(Dragon dragon, String name) throws DragonAlreadyExistsException, DragonNotFoundException{
        this.cadastroDragao.update(dragon, name);
    }

    // métodos de hugo



    // métodos de luana
    
}