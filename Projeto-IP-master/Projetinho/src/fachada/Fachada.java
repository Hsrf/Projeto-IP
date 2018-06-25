package fachada;

import classesBasicas.;
import excecoes.;
import interfaces.RepositoryActivity;
import interfaces.RepositoryDragon;
import interfaces.RepositoryTribe;
import negocio.*;
import repositorios.RepositoryArrayDragon;
import repositorios.RepositoryArrayTribe;

public class Fachada {
    private CadastroTribe registerTribe;
    private RegisterDragon registerDragon;
    private RegisterActivity registerActivity;


    public Fachada (String type) {
        if(type.equals("array")) {
            RepositoryArrayTribe repoT = new RepositoryArrayTribe();
            RepositoryArrayDragon repoD = new RepositoryArrayDragon();
            RepositoryArrayTribe repoA = new RepositoryArrayTribe();
        }else if(type.equals("list")) {

        }
        this.registerTribe = new CadastroTribe(repoT);
        this.registerDragon = new RegisterDragon(repoD);
        this.registerActivity = new RegisterActivity(repoA);
        // luana
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
NOVAS MENSAGENS
Hugosrf - Hoje �s 02:43
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

}