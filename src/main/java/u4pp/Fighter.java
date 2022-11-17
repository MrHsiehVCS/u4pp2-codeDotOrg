package u4pp;

public class Fighter extends Combatant {

    private int exp;
    private int level;
    private int focusMultiplier;
    private boolean isBlocking;

    public Fighter(String name, int maxHealth, int attack) {
        super(name, maxHealth, attack);
        level = 1;
        exp = 0;
        focusMultiplier = 1;
        isBlocking = false;
    }

    public void gainEXP(int exp) {
        exp += exp;
        while(exp >= this.level) {
            exp -= this.level;
            this.level++;
            setAttack(this.getAttackPower() + 1);
            this.setMaxHealth(this.getMaxHealth() + 5);
            this.setHealth(this.getMaxHealth());
        }
    }

    public int getEXP() {
        return this.exp;
    }

    public int getLevel() {
        return this.level;
    }

    public void attack(Combatant target) {
        target.takeDamage(this.getAttackPower() * focusMultiplier);
        focusMultiplier = 1;
    }

    public void block() {
        isBlocking = true;
    }

    public void focus() {
        focusMultiplier *= 2;
    }

    @Override
    public void takeDamage(int damage) {
        if(isBlocking) {
            super.takeDamage(damage/2);
        }
        else
        {
            super.takeDamage(damage);
        }
        isBlocking = false;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", LVL:%s, EXP:%s, FOC:%s, BLK:%s", level, exp, focusMultiplier, isBlocking);
    }
    

}
