import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Simulation {
    private static int numberDice;
    private static int numberTosses;
    Dice dice = new Dice(numberDice,numberTosses);
    Bins bin = dice.bin;
    public Simulation(){
        numberDice = 2;
        numberTosses = 1000000;
    }
    public void runSimulation(){
        dice.tossAndSum(numberDice,numberTosses);
    }
    public void printResults(){
        System.out.println("***\nSimulation of " + numberDice +
                " dice tossed for " + numberTosses + " times. \n***");
        System.out.println(bin.diceBin.get(7));
    }
    public void setNumberDice(int input){
        numberDice = input;
    }
    public int getNumberDice(){
        return numberDice;
    }
    public void setNumberTosses(int input){
        numberTosses = input;
    }
    public int getNumberTosses(){
        return numberTosses;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many dice are we tossing today?");
        String input = scan.nextLine();
        System.out.println("How many tosses?");
        String input2 = scan.nextLine();
        Simulation sim = new Simulation();
        if (input.isEmpty() || input2.isEmpty()) {
            sim.setNumberDice(2);
            sim.setNumberTosses(1000000);
        } else {
            sim.setNumberDice(Integer.parseInt(input));
            sim.setNumberTosses(Integer.parseInt(input2));
        }
        sim.runSimulation();
        sim.printResults();
    }
        // get number of die to roll
        public void setDice(Dice dice){
            this.dice = dice;
        }
        public int getDice(){
            return dice.numberDice;
        }

    //    public Simulation(int numberDice, int numberTosses) {
//        Simulation.numberDice = numberDice;
//        Simulation.numberTosses = numberTosses;
//        Dice dice = new Dice(numberDice, numberTosses);
//    }
}
