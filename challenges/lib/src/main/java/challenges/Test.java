package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Test {
    static int isTwinPaired(int[] a) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        boolean ascendingEven = true;
        boolean ascendingOdd = true;

        for (int j : a) {
            if (j % 2 == 0) evenNumbers.add(j);
            else oddNumbers.add(j);
        }
        for (int i = 0; i < evenNumbers.size(); i++) {
            if (i<evenNumbers.size()-1){
            if (evenNumbers.get(i) > evenNumbers.get(i + 1) ) {
                ascendingEven = false;
                break;
            }
            }
        }

        for (int i = 0; i < oddNumbers.size(); i++) {
            if (i<oddNumbers.size()-1) {
                if (oddNumbers.get(i) > oddNumbers.get(i + 1) ) {
                    ascendingOdd = false;
                    break;
                }
            }
        }

return ascendingEven&&ascendingOdd?1:0;
    }

    public static void main(String[] args) {
        System.out.println(Test.isTwinPaired(new int[]{17}));

    }
}