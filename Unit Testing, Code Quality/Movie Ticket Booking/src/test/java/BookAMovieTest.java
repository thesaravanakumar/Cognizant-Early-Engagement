import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import java.util.Map;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookAMovieTest {
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	static BookAMovie bookAMovie;
	static MovieTicket t1;
	static MovieTicket t2;
	static MovieTicket t3;
	static MovieTicket t4;
	static MovieTicket t5;
	static MovieTicket t6;

	@Before
	public void setUp() throws Exception {
		// Try to create few MovieTicket objects and add to a list.
		// Set that list to movieTicketList in BookAMovie using setMovieTicketList
		// method
		bookAMovie = new BookAMovie();
		
		t1 = new MovieTicket(123, "Avenger", 2, 5, "king", LocalDate.parse("2017-11-10"));
		t2 = new MovieTicket(124, "Iron Man", 1, 5, "queen", LocalDate.parse("2020-08-13"));
		t3 = new MovieTicket(125, "Captain Marvel", 3, 4, "king", LocalDate.parse("2020-08-23"));
		t4 = new MovieTicket(126, "Avenger EndGame", 1, 7, "queen", LocalDate.parse("2020-09-24"));
		
		List<MovieTicket> movieTicketList2 = new ArrayList<>();
		movieTicketList2.add(t1);
		movieTicketList2.add(t2);
		movieTicketList2.add(t3);
		movieTicketList2.add(t4);

		bookAMovie.setMovieTicketList(movieTicketList2);
	}

	@Test
	public void test11ValidateCircleWhenKing() throws InvalidMovieTicketException {
		// test the validateCircle method when a valid circle �king� is provided
		assertTrue(bookAMovie.validateCircle("king"));
	}

	@Test
	public void test12ValidateCircleWhenQueen() throws InvalidMovieTicketException {
		// test the validateCircle method when a valid circle �queen� is provided.
		assertTrue(bookAMovie.validateCircle("queen"));
	}

	@Test
	public void test13ValidateCircleWhenInvalid() throws InvalidMovieTicketException {
		// test the validateCircle method when an invalid circle is passed to this
		// method
		
		exceptionRule.expect(InvalidMovieTicketException.class);
		exceptionRule.expectMessage("Invalid circle");
		bookAMovie.validateCircle("joker");
	}

	@Test
	public void test14AddMovieTicketForValidCircle() throws InvalidMovieTicketException {
		// test the addMovieTicket method when valid circle is provided for the
		// MovieTicket
		assertTrue(bookAMovie.addMovieTicket(123, "Avenger", 2, 5, "king", LocalDate.parse("2017-11-10")));
	}

	@Test
	public void test15AddMovieTicketForInvalidCircle() throws InvalidMovieTicketException {
		// test the addMovieTicket method when invalid circle is provided for the
		// MovieTicket
		exceptionRule.expect(InvalidMovieTicketException.class);
		exceptionRule.expectMessage("Invalid circle");
		
		bookAMovie.addMovieTicket(129, "Captain Marvel", 3, 4, "kingqueen", LocalDate.parse("2020-08-19"));
	}

	@Test
	public void test16ViewMovieTicketByIdForValidId() throws InvalidMovieTicketException {
		// test the viewMovieTicketById method when a ticketId is passed as parameter
		// exists in
		// the movieTicketList
		assertEquals(t1, bookAMovie.viewMovieTicketById(123));
	}

	@Test
	public void test17ViewMovieTicketByIdForInvalidId() throws InvalidMovieTicketException {
		// test the viewMovieTicketById method when a ticketId is passed as parameter
		// does not exist in the movieTicketList
		exceptionRule.expect(InvalidMovieTicketException.class);
		exceptionRule.expectMessage("Invalid movie ticket id");
		
		bookAMovie.viewMovieTicketById(12345);
	}

	@Test
	public void test18ViewMovieTicketByScreen() {
		// test the viewMovieTicketByScreen method
		List<MovieTicket> tmp = new ArrayList<MovieTicket>();
		tmp.add(t2);
		tmp.add(t4);
		
		assertEquals(tmp, bookAMovie.viewMovieTicketByScreen(1));
	}

	@Test
	public void test19VewTicketsMovieWise() {
		// test the viewTicketsMovieWise method
		Map<String, List<MovieTicket>> map = bookAMovie.viewTicketsMovieWise();
		int l = map.size();
		
		assertEquals(4, l);
	}

	@Test
	public void test20ViewScreenWiseTotalSeatsBooked() {
		// test the viewScreenWiseTotalSeatsBooked method
		Map<Integer, Integer> map = bookAMovie.viewScreenWiseTotalSeatsBooked(LocalDate.parse("2017-10-25"),
				LocalDate.now());
		
		assertFalse(map.isEmpty());
	}
}