import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Simulation {
    private static int numberDice;
    private static int numberTosses;


    public Simulation(){
        this.numberDice = 2;
        this.numberTosses = 1000000;
    }

    public Simulation(int numberDice, int numberTosses) {
        this.numberDice = numberDice;
        this.numberTosses = numberTosses;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dice dice = new Dice();
        Bins bins = new Bins(dice.getNumberOfDice());
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




        // get number of die to roll
        dice.setNumberDice(input);

        // set array to dice #
        bins.setArray();

        // roll die and add return to bins
        dice.rollDie();


    }

    public

}
