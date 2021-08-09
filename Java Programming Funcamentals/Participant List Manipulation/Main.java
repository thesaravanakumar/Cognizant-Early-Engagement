import java.util.Scanner;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParticipantUtility participantUtility = new ParticipantUtility();
        int option = 0;

        do {
            System.out.println("1.Add\n2.View\n3.Exit");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1: {
                    String participantName = scanner.nextLine();
                    String departmentName = scanner.nextLine();
                    String collegeName = scanner.nextLine();

                    Participant participant = new Participant();
                    participant.setParticipantName(participantName);
                    participant.setDepartmentName(departmentName);
                    participant.setCollegeName(collegeName);
                    participantUtility.addParticipant(participant);

                    break;
                }
                case 2: {
                    System.out.println("Enter department name");
                    String departmentName = scanner.nextLine();
                    System.out.println("Enter college name");
                    String collegeName = scanner.nextLine();

                    Stream<Participant> filteredParticipantStream = participantUtility.viewAllParticipants(departmentName, collegeName);
                    filteredParticipantStream.forEach(System.out::println);

                    break;
                }
                case 3: {
                    System.out.println("Thank you for using the application");
                    break;
                }
                default: {
                    System.out.println("Please choose a correct option");
                    break;
                }
            }
        } while (option != 3);
    }
}
