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

@ExtendWith(MockitoExtension.class)
public class DefenseMonsterTests {

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
    public void class_isChildOfMonster() {
        assertTrue( testMonster instanceof Monster);        
    }

// public DefenseMonster(String name, int health, int attack, int exp, int defense) {
//     super(name, health, attack, exp);
//     this.defense = defense;
// }

// public int getDefense() {
//     return defense;
// }

    @Test
    public void constructor_callsSuperConstructorCorrectly() {
        assertTrue(testMonster.canFight(), "After calling the constructor, testMonster.canFight() should be true");
        assertEquals(MAX_HEALTH, testMonster.getMaxHealth(), "After calling the constructor, testMonster.getMaxHealth() should be the given maxHealth");
        assertEquals(MAX_HEALTH, testMonster.getHealth(), "After calling the constructor, testMonster.getHealth() should be the given maxHealth");
        assertEquals(ATTACK, testMonster.getAttackPower(), "After calling the constructor, testMonster.getAttack() should be the given attack");
        assertEquals(EXPERIENCE, testMonster.getExpGiven(), "After calling the constructor, testMonster.getExpGiven() should be the given exp");
    }

    @Test
    public void constructor_setsDefenseCorrectly() {

    }


// @Override
// public void takeDamage(int damage) {
//     damage -= defense;
//     if (damage < 0) {
//         damage = 0;
//     }
//     super.takeDamage(damage);
// }
    @Test
    public void takeDamage_decreasesHealthCorrectly(){
        // take 0 damage
        // take neg damage
        // take even damage
        // take odd damage
        // take fatal damage doesn't go below 0
    }

// @Override
// public String toString() {
//     return super.toString() + String.format(", DEF:%s", defense);
// }
    @Test
    public void toString_hasAllStats() {
        //name
        //attack
        //health
        //maxhealth
        //exp
        //def
    }



}



