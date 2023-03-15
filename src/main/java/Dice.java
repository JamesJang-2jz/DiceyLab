import java.util.Random;

public class Dice {
    public int sumOfRoll = 0;
    public int numberDice = 0;
    public int numberTosses;
    Bins bin = new Bins(numberDice,numberTosses);
    public Dice(int numberDice, int numberTosses) {
        this.numberDice = numberDice;
        this.numberTosses = numberTosses;
    }
    public void setNumberDice(int x){
        numberDice = x;
    }
    public int getNumberOfDice(){
        return numberDice;
    }
    public int tossAndSum(int numDice, int numToss) {
        Random roll = new Random();
        for (int i = 1; i <= numToss; i++) {
            int sum  = 0;
            for (int j = 1; j <= numDice; j++) {
                sum += roll.nextInt(6) + 1;
            }
            bin.addToBins(sum);
            System.out.println(sum);
        } return numDice;
    }
    public Integer getRollTotal() {
        return sumOfRoll;
    }
    public void setRollTotal(int sum){
        sumOfRoll = sum;
    }
}
