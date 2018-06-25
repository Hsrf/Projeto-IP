package fachada;

import excecoes.*;
import classesBasicas.*;
import interfaces.*;
import negocio.*;
import repositorios.*;

public class Fachada {
    private CadastroTribe registerTribe;
    private RegisterDragon registerDragon;
    private RegisterActivity registerActivity;
    private RegisterViking registerViking;


    public Fachada (String type) {
        if(type.equals("array")) {
            //Cria os repositorios como arrays
            RepositoryArrayTribe repoT = new RepositoryArrayTribe();
            RepositoryArrayDragon repoD = new RepositoryArrayDragon();
            RepositoryArrayActivity repoA = new RepositoryArrayActivity();
            RepositoryArrayViking repoV = new RepositoryArrayViking();
            this.registerTribe = new CadastroTribe(repoT);
            this.registerDragon = new RegisterDragon(repoD);
            this.registerActivity = new RegisterActivity(repoA);
            this.registerViking = new RegisterViking(repoV);
        }else{
            //Cria os repositorios como Listas
             RepositoryListTribe repoT = new RepositoryListTribe();
             RepositoryListDragon repoD = new RepositoryListDragon();
             RepositoryListActivity repoA = new RepositoryListActivity();
             RepositoryListViking repoV = new RepositoryListViking();
             this.registerTribe = new CadastroTribe(repoT);
             this.registerDragon = new RegisterDragon(repoD);
             this.registerActivity = new RegisterActivity(repoA);
             this.registerViking = new RegisterViking(repoV);
        }
    }

    // métodos de Tribo
    public void registerTribe(Tribe tribe) throws TriboJaCadastradaException{
        this.registerTribe.cadastar(tribe);
    }

    public void removeTribe(Tribe tribe) throws TriboNaoEncontradaException{
        this.registerTribe.remover(tribe);
    }

    public Tribe searchTribe(String name) throws TriboNaoEncontradaException{
        return this.registerTribe.procurar(name);
    }

    public void updateTribeLeader(String tribe, Leader leader) throws MesmoLiderException, TriboNaoEncontradaException{
        this.registerTribe.atualizarLider(tribe, leader);
    }


    // métodos de Dragão
    public void registerDragon(Dragon dragon) throws DragonAlreadyExistsException{
        this.registerDragon.register(dragon);
    }

    public void removeDragon(Dragon dragon) throws DragonNotFoundException{
        this.registerDragon.remove(dragon);
    }
public Dragon searchDragon(String name) throws DragonNotFoundException{
        return this.registerDragon.search(name);
    }

    public void updateDragon(Dragon dragon, String name) throws DragonAlreadyExistsException, DragonNotFoundException{
        this.registerDragon.update(dragon, name);
    }

    // métodos de hugo
    public void registerActivity(Activity activity) throws ActivityAlreadyExistsException{
        this.registerActivity.register(activity);
    }

    public void removeActivity(Activity activity) throws ActivityNotFoundException{
        this.registerActivity.remove(activity);
    }

    public Activity searchActivity(int id) throws ActivityNotFoundException{
        return this.registerActivity.search(id);
    }

    public void updateActivity(Activity activity, String place) throws ActivityAlreadyExistsException, ActivityNotFoundException{
        this.registerActivity.update(activity, place);
    }


    // métodos de luana
    
    public void registerViking(Viking viking) throws VikingAlreadyExistsException{
        this.registerViking.insert(viking);
    }

    public void removeViking(Viking viking) throws VikingNotFoundException{
        this.registerViking.remove(viking);
    }

    public Viking searchViking(String name) throws VikingNotFoundException{
        return this.registerViking.search(name);
    }

    public void updateViking(Viking viking, String name) throws VikingAlreadyExistsException, VikingNotFoundException{
        this.registerViking.update(viking, name);
    }

}