package basicOperation;

import java.util.HashSet;
import java.util.Set;

import static basicOperation.ProblemInArray.prettyPrint;

public class ArraySumUsingSet {
    public static void main(String args[]) {
        prettyPrint(getRandomArray(9), 11);
        prettyPrint(getRandomArray(10), 12);
    }

    public static int[] getRandomArray(int length) {
        int[] randoms = new int[length];
        for (int i = 0; i < length; i++) {
            randoms[i] = (int) (Math.random() * 15);
        }
        return randoms;
    }

}