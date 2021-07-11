import java.util.ArrayList;
import java.util.Scanner;
 
 public class Main {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   // fill your code here
 
   System.out.println("Enter the source");
   String source = s.next();
 
   System.out.println("Enter the destination");
   String destination = s.next();
 
   System.out.println("Enter the coach type");
   String coachType = s.next();
   s.close();
 
   if (coachType.equalsIgnoreCase("AC1") || coachType.equalsIgnoreCase("AC2") || coachType.equalsIgnoreCase("AC3")
     || coachType.equalsIgnoreCase("Sleeper") || coachType.equalsIgnoreCase("Seater")) {
 
    TrainManagementSystem tms = new TrainManagementSystem();
    ArrayList<Train> trainList = tms.viewTrain(coachType, source, destination);
 
    if (trainList.isEmpty()) {
     System.out.println("No trains found");
     return;
    }
 
    for (Train train : trainList) {
     System.out.println(train.getTrainNumber() + " " + train.getTrainName());
    }
    return;
   }
   System.out.println("Invalid Coach Type");
  }
 }
