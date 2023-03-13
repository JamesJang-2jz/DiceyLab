import java.util.Scanner;

public class Simulation {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many dice are we tossing today?");
        int input = scan.nextInt();
        Dice dice = new Dice();
        Bins bins = new Bins(dice.getNumberOfDice());


        // roll die and add return to bins


        dice.setNumberDice(input);



    }



}
