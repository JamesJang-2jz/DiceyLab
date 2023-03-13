import java.util.Random;

public class Dice {

    public int rollTotal = 0;
    public int newRoll = 0;
    public int numberOfDice = 0;
    public Dice(){
    }
    public void setNumberDice(int x){
        numberOfDice = x;
    }
    public int getNumberOfDice(){
        return numberOfDice;
    }
    public int rollDie(int rolls) {
        Random roll = new Random();
        for (int i = 1; i <= rolls; i++) {
            newRoll = roll.nextInt(6) + 1;
                rollTotal+= newRoll;
        }
        return rollTotal;
    }
    //
    public





}
