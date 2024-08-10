import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobileManagementSystem mobileManagementSystem = new MobileManagementSystem();

        System.out.println("Enter the minimum range");
        int minRange = scanner.nextInt();
        System.out.println("Enter the maximum range");
        int maxRange = scanner.nextInt();

        Map<Integer, Integer> mobiles = mobileManagementSystem.viewMobileWithInTheRange(minRange, maxRange);

        if (mobiles.isEmpty()) {
            System.out.println("No mobiles found for the given range\n" +
                    "\n");
        } else {
            mobiles.forEach((key, value) -> System.out.println(key + ":" + value));
        }
    }
}
