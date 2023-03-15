import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Simulation {
    private static int numberDice;
    private static int numberTosses;
    Dice dice;


    public Simulation(){
        numberDice = 2;
        numberTosses = 1000000;
        Dice dice = new Dice(numberDice,numberTosses);
    }

    public Simulation(int numberDice, int numberTosses) {
        Simulation.numberDice = numberDice;
        Simulation.numberTosses = numberTosses;
        Dice dice = new Dice(numberDice, numberTosses);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many dice are we tossing today?");
        String input = scan.nextLine();
        System.out.println("How many tosses?");
        String input2 = scan.nextLine();
        if (input.isEmpty() || input2.isEmpty()) {
            numberTosses = 1000000;
            numberDice = 2;
        } else {
            numberDice = Integer.parseInt(input);
            numberTosses = Integer.parseInt(input2);
        }
    }
        Simulation sim = new Simulation(numberDice, numberTosses);


        // get number of die to roll
        public void setDice(Dice dice){
            this.dice = dice;
        }
        public int getDice(){
            return dice.numberDice;
        }

        /** set array to dice #
              bins.setArray();


        roll die and add return to bins
        dice.rollDie();
         */


}
