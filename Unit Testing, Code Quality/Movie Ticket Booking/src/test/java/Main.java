import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(BookAMovieTest.class);

		if (result.getFailureCount() == 0) {
			System.out.println("No Failures");
		} else {
			for (Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
			}
		}
		
		System.out.println("Result " + result.wasSuccessful());
	}
}