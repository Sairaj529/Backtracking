/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import java.util.ArrayList;

public class diceRoll {
    public static void diceRoll(int dice) {
        diceRoll(dice, new ArrayList<>());
    }

    public static int count = 0;

    private static void diceRoll(int dice, ArrayList<Integer> list) {
        count++;
        if (dice == 0) {
            System.out.println(list.toString());
            return;
        }

        for (int i = 1; i < 7; i++) {
            list.add(i);
            diceRoll(dice - 1, list);
            list.remove(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        diceRoll(7);
        System.out.println(count);

    }
}
