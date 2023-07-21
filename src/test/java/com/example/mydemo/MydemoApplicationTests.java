package com.example.mydemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.mydemo.Model.User;
import com.example.mydemo.Repository.demoRepo;
import com.example.mydemo.service.demoService;

@SpringBootTest
class MydemoApplicationTests {

	@Autowired
	demoService serve;

	@MockBean	//Will be used only for mocking purpose
	demoRepo repo;

	@Test
	void contextLoads() {
		when(repo.findAll()).thenReturn(Stream.of(new User("abc@gmail.com", 1234567890, "abc123"), new User("abc@gmail.com", 1234567890, "abc123")).collect(Collectors.toList()));
				//assertEquals(mocking rows,checking the size of the db);
		assertEquals(2,serve.getting().size());
	}

}
