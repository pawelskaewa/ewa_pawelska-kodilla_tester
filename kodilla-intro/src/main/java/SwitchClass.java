import java.util.Scanner;

public class SwitchClass {
    public static String getColorName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of the color (B - blue, G - green, Y - yellow, R - red): ");
            String colorName = scanner.nextLine().trim().toUpperCase();
            switch (colorName) {
                case "B":
                    return "blue";
                case "G":
                    return "green";
                case "Y":
                    return "yellow";
                case "R":
                    return "red";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}
