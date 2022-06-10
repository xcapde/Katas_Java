package katas;

public class CharacterS {
    private int maxHealth = 1000;
    private int health = 1000;
    private int level = 1;
    private boolean alive = true;

    public int getHealth(){
        return this.health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAlive() {
        return alive;
    }

    public void attacksOther(CharacterS victim, int damage){
        if ( victim == this) return;
        victim.damage(damage);
    }

    private void damage(int damage) {
        if (this.health - damage <= 0){
            this.alive = false;
            this.health = 0;
            return;
        }
        this.health -= damage;
    }

    public void healOther(CharacterS character, int heal){
        if (character != this) return;
        character.heal(heal);
    }

    private void heal(int heal){
        if (!this.alive) return; // CLÀUSULA SALVAGUARDA
        this.health += heal;
        if (this.health > maxHealth) this.health = maxHealth;
    }

}
