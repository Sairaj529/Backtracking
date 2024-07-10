/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

public class printBinary {

    public static void printBinary(int n, String string) {
        if (n == 0) {
            System.out.println(string);
            return;
        }

        printBinary(n - 1, string + 0);
        printBinary(n - 1, string + 1);

    }

    public static void main(String[] args) {
        printBinary(6, "");
    }
}
