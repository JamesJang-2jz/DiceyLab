import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bins {
    public int numberDice;
    public int numberTosses;
    public Map<Integer, Integer> diceBin = new HashMap<>();
    public Bins(int numberDice, int numberTosses) {
        this.numberDice = numberDice;
        this.numberTosses = numberTosses;
    }
    // add rolled dice rolled number to map
    public void addToBins(int x) {
        if (diceBin.containsKey(x)){
            diceBin.put(x, diceBin.get(x) + 1);
        } else {
            diceBin.put(x,1);
        }
    }
}
