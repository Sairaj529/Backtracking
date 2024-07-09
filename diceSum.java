/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import java.util.ArrayList;

public class diceSum {
    public static void diceSum(int dice, int sum) {
        diceSumHelper(dice, sum, 0, new ArrayList<>());
    }

    public static int count = 0;

    private static void diceSumHelper(int dice, int sum, int sumSoFar, ArrayList<Integer> list) {
        count++;
        if (dice == 0) {
            System.out.println(list.toString());
        }
        else {

            for (int i = 1; i < 7; i++) {
                // The potential answer(s) should be in range
                // avoid it being too small, and                                //in this case compare with it maximum
                // avoid it being too big                                       //in this case compare with minimum
                boolean tooBig = (sumSoFar + i + 1 * (dice - 1) <= sum);
                boolean tooSmall = (sumSoFar + i + 6 * (dice - 1) >= sum);

                if (tooSmall && tooBig) {
                    list.add(i);
                    diceSumHelper(dice - 1, sum, sumSoFar + i, list);
                    list.remove(list.size() - 1);
                }
            }
        }

    }

    public static void main(String[] args) {
        diceSum(4, 5);
        System.out.println(count);

    }
}
