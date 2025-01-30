package application;

public class App {
    public static void main(String[] args) {
        String cpf = "715.755.424-04";
        String[] cpfSplit = cpf.split("\\.");
        String[] cpfLast = cpfSplit[2].split("-");
        String cpfFormatted = cpfSplit[0] + cpfSplit[1] + cpfLast[0] + cpfLast[1];

        String original = "KKK abcde FGHIJ ABC abc DEFG";

        String originalLowerCase = original.toLowerCase();

        String[] lista = original.split(" ");

        System.out.println("cpf: " + cpfFormatted);
        System.out.println(originalLowerCase);
    }
}
