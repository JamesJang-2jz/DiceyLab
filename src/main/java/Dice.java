import java.util.Random;
import java.util.Scanner;

public class Dice {

    public int rollTotal = 0;
    public int newRoll = 0;
    public static int numberOfDice = 0;
    public int lowest;
    public int highest;
    Bins bin;
    Scanner scan = new Scanner(System.in);
    public Dice(){
    }

    public void howManyDice(Scanner scan){
        // Ask for number of dice to toss;
        System.out.println("How many dice are we tossing today?");
        int scan = scan.nextInt();
    }
    public void setNumberDice(int x){
        numberOfDice = x;
    }
    public int getNumberOfDice(){
        return numberOfDice;
    }
    public int rollDie() {
        Random roll = new Random();
        for (int i = 1; i <= numberOfDice; i++) {
            newRoll = roll.nextInt(6) + 1;
                rollTotal+= newRoll;
        }
        return rollTotal;
    }
    public


}
