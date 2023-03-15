import java.util.Random;

public class Dice {
    public int sumOfRoll = 0;
    public int newRoll = 0;
    public int numberDice = 0;
    public int numberTosses;
    Bins bin;

    public Dice(int numberDice, int numberTosses) {
        this.numberDice = numberDice;
        this.numberTosses = numberTosses;
        Bins bin = new Bins(numberDice,numberTosses);
    }
    //
    public void setNumberDice(int x){
        numberDice = x;
    }
    public int getNumberOfDice(){
        return numberDice;
    }

    public int rollDie(int dice) {
        Random roll = new Random();
        int rollTotal = 0;
        for (int i = 1; i <= dice; i++) {
            newRoll = roll.nextInt(6) + 1;
                rollTotal+= newRoll;
        } setRollTotal(rollTotal);
        return rollTotal;
    }
    public Integer tossAndSum(){
        return null;
    }

    public Integer getRollTotal() {
        return sumOfRoll;
    }
    public void setRollTotal(int sum){
        sumOfRoll = sum;
    }
}
