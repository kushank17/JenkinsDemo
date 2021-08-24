package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsDemoApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(12, SpringBootJenkinsDemoApplication.add(1, 1));
	}

}
