import java.util.Map;

public class Bins {
    public int numberDice = 0;
    public int numberTosses = 0;
    public String[] binsAssorted;
    Map<Integer, Integer> diceBin;

    public Bins(int numberDice, int numberTosses) {
        this.numberDice = numberDice;
    }
    public void setArray() {
        binsAssorted = new String[numberDice * 6];

    }
    // add rolled dice rolled number to array
    public void addToBins(int x) {
        for (int i = numberDice; i < numberDice * 6; i++) {


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
