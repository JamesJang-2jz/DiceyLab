import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {
    @Test
    public void testDice() {
        // Given
        Dice dice  = new Dice();
        Integer numRolls = 10;
        Integer expectedRoll = dice.rollDie(numRolls);
        // When
        Integer numberDice = 2;
        dice.setNumberDice(numberDice);

        // Then
        Assert.assertEquals(expectedRoll, );
    }
}