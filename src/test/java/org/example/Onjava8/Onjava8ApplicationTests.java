package org.example.Onjava8;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.context.SpringBootTest;import static org.assertj.core.api.Assertions.assertThat;import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class Onjava8ApplicationTests {

	@Autowired
	Hello hello;
	@Test
	void contextLoads() {

		String result = hello.doSomething();
		assertNotNull(result);
	}

}
