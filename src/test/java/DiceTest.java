import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {
    @Test
    public void testDice() {
        // Given
        int numDice = 2;
        int numToss = 0;
        Dice dice  = new Dice(numDice, numToss);
        Integer numRolls = 10;
        Integer expectedRoll = dice.rollDie(numRolls);
        Integer actualRoll = dice.getRollTotal();
        // When
        dice.setNumberDice(numDice);

        // Then
        Assert.assertEquals(expectedRoll, actualRoll);
    }
}