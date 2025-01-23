import java.lang.reflect.Array;
import java.util.ArrayList;

public class AppAlgoritmos {
    public static void main(String[] args) throws Exception {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int startArray = 0;
        int finalArray = s.length - 1;

        while (startArray < finalArray) {

            char startTemp = s[startArray];
            s[startArray] = s[finalArray];
            s[finalArray] = startTemp;

            startArray++;
            finalArray--;
        }
        for (char teste : s) {
            System.out.println("\n" + teste);
        }
    }
}