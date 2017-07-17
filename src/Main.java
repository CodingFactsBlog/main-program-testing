import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        scanner.nextLine();
        while (numberOfLines > 0) {
            String[] s = scanner.nextLine().split(" ");
            System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
            --numberOfLines;
        }
    }
}
