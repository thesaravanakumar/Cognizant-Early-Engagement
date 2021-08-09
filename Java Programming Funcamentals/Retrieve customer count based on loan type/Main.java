import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoanManagementSystem loanManagementSystem = new LoanManagementSystem();

       while (true) {
           System.out.println("Enter the type of loan to be searched");
           String loanType = scanner.next();
           int count = loanManagementSystem.viewLoanCountBasedOnType(loanType);

           if (count > 0) {
               System.out.println(String.format("Number of customers who have taken %s loan : %d", loanType, count));
           } else {
               System.out.println(String.format("No customer has acquired %s loan", loanType));
           }

           System.out.println("Do you want to searched again the loan type (yes/no)");
           String input = scanner.next();

           if (input.equalsIgnoreCase("no")) {
               System.out.println("Thank you for using the Application");
               break;
           }
       }
    }
}
