import java.util.ArrayList;
import java.util.Arrays;

public class AppAlgoritmos {
    public static void main(String[] args) throws Exception {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        int[] colors = { 1, 2, 0 };
        sortColors(colors);
        reverseString(s);
        System.out.println(reverseWords("\n marcos abrante"));
        System.out.println("teste");
    }

    // 0 4 (o, h)
    // 1 3 (o, l, e,h)
    // 22 não muda porque é o meio
    // Então a logica é: enquanto o finalIndex for maior que o StartIndex a lógica
    // continua
    // Porquê só deve parar caso o startIndex e o finalIndex seja igual e o
    // finalIndex não pode ser menor que o startIndex
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

    public static boolean isPalindrome(int x) {
        String numberToString = String.valueOf(x);
        String[] numberToStringSplit = numberToString.split("");
        String numberInverse = "";
        for (int i = numberToStringSplit.length - 1; i >= 0; i--) {
            numberInverse += numberToStringSplit[i];
        }
        if (numberInverse.equals(numberToString)) {
            return true;
        }
        return false;
    }

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int leftValueTemp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = leftValueTemp;
                }
            }
        }
    }

    public static String reverseWords(String s) {
        String[] stringList = s.split(" ");
        for (int i = 0; i < stringList.length; i++) {
            String[] wordSplit = stringList[i].split("");
            int leftIndex = 0;
            int rightIndex = wordSplit.length - 1;

            while (rightIndex > leftIndex) {

                String temp = wordSplit[leftIndex];
                wordSplit[leftIndex] = wordSplit[rightIndex];
                wordSplit[rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }

            StringBuilder wordFormatted = new StringBuilder();
            for (String lettersWord : wordSplit) {
                wordFormatted.append(lettersWord);
            }
            stringList[i] = wordFormatted.toString();
        }
        StringBuilder reverseWordsString = new StringBuilder();
        for (int i = 0; i < stringList.length; i++) {
            reverseWordsString.append(stringList[i]);
            if (i != stringList.length - 1) {
                reverseWordsString.append(" ");
            }
        }
        return reverseWordsString.toString();
    }

    public static int[] twoSum(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer < rightPointer) {
            int sum = nums[leftPointer] + nums[rightPointer];
            if (sum == target) {
                int[] list = { leftPointer, rightPointer };
                return list;
            }
            if (sum > target) {
                rightPointer--;
            }
            if (sum < target) {
                leftPointer++;
            }
        }
        return new int[] {};
    }

    public int binarySearch(int[] nums, int target) {
        int lowerIndex = 0;
        int highIndex = nums.length - 1;

        while (lowerIndex <= highIndex) {
            int mid = lowerIndex + (highIndex - lowerIndex) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                lowerIndex = mid + 1;
            } else {
                highIndex = mid - 1;
            }
        }
        return -1;
    }
}