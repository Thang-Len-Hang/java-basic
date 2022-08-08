
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class StringCalculatorTest {

	private StringCalculator stringCalculator;

	@BeforeEach
	public void init() {
		stringCalculator = new StringCalculator();
	}

	@Test
	public void should_return_0_when_empty_string_is_given() {
		assertThat(stringCalculator.add(""), equalTo(0));
	}

	@Test
	public void should_return_integer_num_when_single_string_number_is_given() {
		assertThat(stringCalculator.add("5"), equalTo(5));
	}

	@Test
	public void should_return_sum_when_two_stirng_nums_are_given() {
		assertThat(stringCalculator.add("5,6"), equalTo(11));
	}

	@Test
	public void should_return_sum_when_multiple_string_nums_are_given() {
		assertThat(stringCalculator.add("5,6,4"), equalTo(15));
	}

	@Test
	public void should_return_sum_when_multiple_string_nums_with_new_line_delimiters_are_given() {
		assertThat(stringCalculator.add("1\n2,3,5"), equalTo(11));
	}

	@Test
	public void should_return_sum_neglect_string_num_is_greater_than_1000() {
		assertThat(stringCalculator.add("1,1007,7"), equalTo(8));
	}

	@Test
	public void should_throw_RuntimeException_with_message_when_negative_num_is_given() {
		RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class,
				()-> stringCalculator.add("1,2,-3,5,-7"));
		assertThat(runtimeException.getMessage(),equalTo("Negative number isn't allowed!!!"));
	}
}
