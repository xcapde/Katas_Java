package katas.RPGcombat;

import java.util.HashSet;
import java.util.Set;

public class Faction extends CharacterS{

    private String name;

    public Faction(String name){
    }

    private Set<CharacterS> fightersList = new HashSet<>();

    public boolean containsFighter(CharacterS character){
        return fightersList.contains(character);
    }

    public void addFighter(CharacterS character){
        if(!this.containsFighter(character)){
        this.fightersList.add(character);}
    }

    public int countFighters(){
        return this.fightersList.size();
    }

    public void removeFighter(CharacterS character){
        if(this.containsFighter(character)){
            this.fightersList.remove(character);}
    }

    public boolean fightersAreAllies(CharacterS character, CharacterS character2) {
        return fightersList.contains(character) && fightersList.contains(character2);
    }
}
