import java.util.Scanner;

public class UserInterface {
    public static TuitionFee generateFeeReceipt() {
        return (String courseType, int basicFee, int noOfSemesters) -> {
            int regularFee = basicFee * noOfSemesters;

            if (courseType.equalsIgnoreCase("regular")) {
                return regularFee;
            } else if (courseType.equalsIgnoreCase("selfFinance")) {
                return regularFee + 50000;
            } else {
                return 0;
            }
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter registration number");
        int registrationNumber = scanner.nextInt();
        System.out.println("Enter student name");
        String studentName = scanner.next();
        System.out.println("Enter no of semesters");
        int noOfSemesters = scanner.nextInt();
        System.out.println("Enter basic fee");
        int basicFee = scanner.nextInt();
        System.out.println("Course type");
        String courseType = scanner.next();

        TuitionFee tuitionFee = generateFeeReceipt();
        int tuitionFeeAmount = tuitionFee.calculateTuitionFees(courseType, basicFee, noOfSemesters);

        System.out.println("Fees Receipt");
        System.out.println("Registration number: "+ registrationNumber);
        System.out.println("Student name: " + studentName);
        System.out.println(String.format("Tuition fee for %s student: %d", courseType, tuitionFeeAmount));
    }
}
