package katas;

import java.util.HashSet;
import java.util.Set;

public class Faction extends CharacterS{

    private String name;

    public Faction(String name){
    }

    private Set<CharacterS> fightersList = new HashSet<>();

    public void addFighter(CharacterS character){
        if(!character.belongsToAFaction()){
        this.fightersList.add(character);}
    }

    public int countFighters(){
        return this.fightersList.size();
    }

    public void removeFighter(CharacterS character){
        if(character.belongsToAFaction()){
            this.fightersList.remove(character);}
    }

}
