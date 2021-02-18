package Service;

import enity.Whore;
import repo.WhoreRepo;

import java.util.ArrayList;

public class ServiceWhore {
    WhoreRepo repo;

    public ServiceWhore(){
        repo = new WhoreRepo();
    }

    public void addWhore(Whore whore) {
        repo.add(whore);
    }

    public ArrayList<Whore> getAllWhore() {
        return repo.getAll();
    }

    public Whore searchByName(String nameFromTerminal) {
        for(Whore whore : repo.getAll()){
            if(nameFromTerminal.equals(whore.getName())){
                return whore;
            }
        }
        return null;
    }
}
