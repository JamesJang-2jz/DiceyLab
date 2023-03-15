import java.util.Random;
import java.util.Scanner;

public class Dice {

    public int rollTotal = 0;
    public int newRoll = 0;
    public static int numberDice = 0;
    public int lowest;
    public int highest;
    Bins bin;

    public Dice(){
    }

    public void howManyDice(Scanner scan){
        // Ask for number of dice to toss;

    }
    public void setNumberDice(int x){
        numberDice = x;
    }
    public int getNumberOfDice(){
        return numberDice;
    }
    public int rollDie(int dice) {
        Random roll = new Random();
        for (int i = 1; i <= dice; i++) {
            newRoll = roll.nextInt(6) + 1;
                rollTotal+= newRoll;
        }
        return rollTotal;
    }
    public Integer tossAndSum(){

    }


}
