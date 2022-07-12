import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) System.out.println(new NumberDividers(scanner.nextInt()));
        else System.out.println("Invalid input");
        scanner.close();
    }
}
