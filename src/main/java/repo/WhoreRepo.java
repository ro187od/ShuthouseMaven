package repo;

import enity.Whore;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class WhoreRepo {
    private List<Whore> whores;

    public WhoreRepo(){
        this.whores = new ArrayList<>();
    }

    public void add(Whore whore){
        whores.add(whore);
    }

    public ArrayList<Whore> getAll(){
        return (ArrayList<Whore>) whores;
    }
}
