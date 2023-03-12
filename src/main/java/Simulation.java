import java.util.Scanner;

public class Simulation {

    public static void main(String[] args){
        Dice dice = new Dice();
        Bins bins = new Bins();


        // roll die and add return to bins
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        dice.setNumberDice(input);



    }



}
