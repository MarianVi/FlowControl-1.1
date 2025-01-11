import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:
        int numar = scanner.nextInt();
        System.out.print("Cifrele numarului sunt: ");
        while (numar != 0) {
            int lastDigit = numar % 10;
            if (numar < 10) {
                System.out.print(lastDigit);
            } else {
                System.out.print(lastDigit + ", ");
            }
            numar /= 10;
        }
    }
}