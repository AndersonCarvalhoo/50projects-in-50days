import java.util.InputMismatchException;
import java.util.Scanner;

public class AppTryCatch {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static void method1() {
        System.out.println("***Method1 START***");
        method2();
        System.out.println("***Method1 END***");
    }

    public static void method2() {
        System.out.println("***Method2 START***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (InputMismatchException exception) {
            System.out.println("Input Error ");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid Position");
        }
        System.out.println("End of program");
        sc.close();
        System.out.println("***Method2 END***");
    }
}
