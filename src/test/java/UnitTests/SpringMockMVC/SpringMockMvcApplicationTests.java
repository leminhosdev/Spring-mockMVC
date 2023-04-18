package UnitTests.SpringMockMVC;

import UnitTests.SpringMockMVC.model.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class SpringMockMvcApplicationTests {
	Calculator underTest = new Calculator();
	@Test
	void itShouldaddNumbers(){
		int numberOne = 10;
		int numberTwo = 60;
		int result = underTest.add(numberOne, numberTwo);

		assertThat(result).isEqualTo(70);
	}


}
