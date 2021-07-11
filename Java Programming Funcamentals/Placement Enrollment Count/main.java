import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Fill your code here
        System.out.println("Enter all roll numbers separated by comma");
        Stream<String> st = Main.getRollNumbers(sc.nextLine());
        System.out.println("Enter the department name acronym");
        String dept = sc.nextLine();
        int result = Main.getCount(st,dept);
        if(result == 0){
            System.out.println("No students from "+dept);
        }
        else{
            System.out.println("Number of students in "+dept+" is "+result);
        }

	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
		String arr[] =rollNumbers.split(",");
		List<String> rolllist = Arrays.asList(arr);
		return rolllist.stream();


	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here

        int count = (int)rollNumberStream.filter(s->s.substring(0,2).equalsIgnoreCase(dept)).count();
        return count;

	}

}
