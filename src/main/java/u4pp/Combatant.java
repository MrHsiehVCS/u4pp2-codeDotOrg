package u4pp;

public class Combatant {
    private String name;
    private int maxHealth;
    private int health;
    private int attack;

    public Combatant(String name, int maxHealth, int attack) {
        this.name = name;
        this.maxHealth = Math.max(maxHealth,1);
        this.health = this.maxHealth;
        this.attack = Math.max(attack, 0);
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
        if(health < 0) {
            health = 0;
        }
        if(health > this.maxHealth) {
            this.health = this.maxHealth;
        }
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        setHealth(this.health);
    }

    public int getAttackPower() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void takeDamage(int damage) {
        setHealth(this.health - damage);
    }

    public boolean canFight() {
        return this.health > 0;
    }

    @Override
    public String toString() {
        return String.format("%s - HP:%s/%s, ATK:%s", name, health, maxHealth, attack);
    }
}
