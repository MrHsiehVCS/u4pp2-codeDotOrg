package u4pp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

public class FighterTests {
    private final String NAME = "TestMonster"; 
    private final int MAX_HEALTH = 10; 
    private final int ATTACK = 3; 
    private final int EXPERIENCE = 5; 
    Monster testMonster;
    Combatant target;

    @BeforeEach
    public void beforeEach() {
        testMonster = new Monster(NAME, MAX_HEALTH, ATTACK, EXPERIENCE);
        target = new Fighter("TestFighter", MAX_HEALTH, ATTACK);

        testMonster = Mockito.spy(testMonster);
        target = Mockito.spy(target);
    }

    @Test
    public void class_isChildOfCombatant() {
        assert(target instanceof Combatant);
    }
    // public Fighter(String name, int maxHealth, int attack) {
    //     super(name, maxHealth, attack);
    //     level = 1;
    //     exp = 0;
    //     focusMultiplier = 1;
    //     isBlocking = false;
    // }


        // public int getEXP() {
    //     return this.exp;
    // }

    // public int getLevel() {
    //     return this.level;
    // }
    @Test
    public void constructor_setsDefaultValuesCorrectly() {
        // level
        // exp
    }



    // public void gainEXP(int exp) {
    //     exp += exp;
    //     while(exp >= this.level) {
    //         exp -= this.level;
    //         this.level++;
    //         setAttack(this.getAttackPower() + 1);
    //         this.setMaxHealth(this.getMaxHealth() + 5);
    //         this.setHealth(this.getMaxHealth());
    //     }
    // }

    @Test
    public void gainEXP_whenNotLeveling_setEXPCorrectly() {

    }

    @Test
    // must also work if the character levels multiple times
    public void gainEXP_whenLeveling_resetsEXP() {

    }

    @Test
    // must also work if the character levels multiple times
    public void gainEXP_whenLeveling_incrementsLevel() {
        
    }

    @Test
    // must also work if the character levels multiple times
    public void gainEXP_whenLeveling_refillsHealth() {
        // health == maxhealth
    }

    @Test
    // must also work if the character levels multiple times
    public void gainEXP_whenLeveling_increasesStats() {
        // attack
        // maxHealth
    }




    // public void attack(Combatant target) {
    //     target.takeDamage(this.getAttackPower() * focusMultiplier);
    //     focusMultiplier = 1;
    // }
    // public void focus() {
    //     focusMultiplier *= 2;
    // }
    @Test
    public void attack_whenFocused_doublesDamagePerStack() {
        // for 0, 1, 2, 3, 4, 5...10 stacks, make sure the damage is correct
    }

    // public void block() {
    //     isBlocking = true;
    // }
    
    // @Override
    // public void takeDamage(int damage) {
    //     if(isBlocking) {
    //         super.takeDamage(damage/2);
    //     }
    //     else
    //     {
    //         super.takeDamage(damage);
    //     }
    //     isBlocking = false;
    // }
    @Test
    public void block_takingEvenDamage_reducesDamageForOneAttack() {
        // block, monster attack (even damage), check health is expected
    }

    @Test
    public void block_takingOddDamage_reducesDamageForOneAttack() {
        // block, monster attack (odd damage), check health is expected
    }

    @Test
    public void block_takingDamageTwice_reducesDamageForOneAttack() {
        // take damage again to make sure that block doesn't last more than 1 round
    }


    

   

    

    // @Override
    // public String toString() {
    //     return super.toString() + String.format(", LVL:%s, EXP:%s, FOC:%s, BLK:%s", level, exp, focusMultiplier, isBlocking);
    // }

    @Test
    public void toString_hasAllStats() {
        
    }
}
