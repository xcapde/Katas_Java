package katas;

public class Character {

    // VARIABLES
    private String name = "";
    private int level = 1;
    private int health = 1000;
    private int maxHealth = 1000;
    private int damagePower = 0;
    private int healingPower = 0;
    private boolean isAlive(){
        return this.health >= 1;
    }

    // CONSTRUCTOR DE L'OBJECTE
/*    public Character(int level, int health){
        this.level = 1;
        this.health = 1000;
    }*/

    // SET METHODS
    public void setLevel(int level){
        this.level = level;
    }

    // GET METHODS
    public int getInitHealth() {
        return this.maxHealth;
    }

    public int getInitLevel() {
        return this.level;
    }

    public boolean getAliveStatus(){
        return this.isAlive();
    }

    // OTHERS METHODS
    public int isDamaged(int damageAmount, Character character){
        if(this == character) {
            return this.health;
        }
        if(this.level - character.level >= 5){
            return this.health -= damageAmount / 2;
        }
        return this.health -= damageAmount * 2;
    }

    public boolean canBeHealed(){
        return this.isAlive() && this.health <= this.maxHealth;
    }

    public int isHealed(int healingAmount, Character character){
        if(this != character){
            return this.health;
        }
        return this.health += healingAmount;
    }

}
