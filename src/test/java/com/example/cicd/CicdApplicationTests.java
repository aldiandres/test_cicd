package com.example.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CicdApplicationTests {

	@Test
	void contextLoads() {
		  String result = "Hello CI/CD";
        assertEquals("Hello CI/CD", result);
	}

}
