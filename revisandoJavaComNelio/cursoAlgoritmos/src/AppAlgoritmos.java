public class AppAlgoritmos {
    public static void main(String[] args) throws Exception {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        isPalindrome(121);
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
        System.out.println(numberInverse instanceof String);
        System.out.println(numberToString instanceof String);
        if (numberInverse.equals(numberToString)) {
            System.out.println("igual");
            return true;
        }
        System.out.println("não igual");
        return false;
    }
}