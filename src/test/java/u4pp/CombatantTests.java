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

public class CombatantTests {



    @BeforeEach
    public void beforeEach() {
        // create 
    }

    @Test 
    public void constructor_setsParametersCorrectly() {
        //name
        //health
        //maxhealth
        //attackPower
    
    }


    @Test
    public void setHealth_setsHealthCorrectly() {
        // cannot go below 0

    }

   



   
    @Test
    public void setMaxHealth_setsMaxHealthCorrectly() {

        // cannot go below 0
    }


    
    @Test
    public void setAttack_setsAttackCorrectly() {
        // cannot go below 0

    }

    // public void takeDamage(int damage) {
    //     setHealth(this.health - damage);
    // }
    @Test
    public void takeDamage_decreasesHealthCorrectly() {

        // can't go below 0
    }

    // public boolean canFight() {
    //     return this.health > 0;
    // }
    @Test
    public void canFight_whenHasHealth_returnsTrue() {

    }

    @Test
    public void canFight_whenHas0Health_returnFalse() {

    }


    // @Override
    // public String toString() {
    //     return String.format("%s - HP:%s/%s, ATK:%s", name, health, maxHealth, attack);
    // }
    @Test
    public void toString_hasAllStats() {

    }
}
