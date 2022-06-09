package katas;

public class Character {

    // VARIABLES

    private int level = 1;
    private int health = 1000;
    private int maxHealth = 1000;
    private int damagePower = 0;
    private int healingPower = 0;
    private boolean isAlive(){
        return this.health >= 1;
    }

    // GETS

    public int getInitHealth() {
        return this.maxHealth;
    }

    public int getInitLevel() {
        return this.level;
    }

    public boolean getAliveStatus(){
        return this.isAlive();
    }

    public int isDamaged(int damageAmount, Character character){
        return this.health -= damageAmount;
    }

    public boolean canBeHealed(){
        return this.isAlive() && this.health <= this.maxHealth;
    }

    public int isHealed(int healingAmount, Character character){
        return this.health += healingAmount;
    }

/*
    public boolean canBeDamaged(Character){
        return Character.class
    }

    public.Character.self = this;*/

}
