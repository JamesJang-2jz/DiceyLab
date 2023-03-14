import java.util.Map;

public class Bins {
    public int numberOfDice = 0;
    public String[] binsAssorted;
    Map<Integer, Integer> diceBin;

    public Bins(int numberDie) {
        this.numberOfDice = numberDie;
    }
    public void setArray() {
        binsAssorted = new String[numberOfDice * 6];

    }
    // add rolled dice rolled number to array
    public void addToBins(int x) {
        for (int i = numberOfDice; i < numberOfDice * 6; i++) {


        }
    }

    // print bins method
    public String[] printBins() {
        for (int i = 0; i < binsAssorted.length; i++) {
            System.out.println(binsAssorted[i]);
        }
        return new String[0];
    }
}
