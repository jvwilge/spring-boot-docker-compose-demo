package io.github.jvwilge.composedemo;

import io.github.jvwilge.composedemo.domain.Car;
import io.github.jvwilge.composedemo.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ComposeDemoApplicationTests {

	private final CarRepository repository;

	ComposeDemoApplicationTests(@Autowired CarRepository repository) {
		this.repository = repository;
	}

	@Test
	void contextLoads() {
		final Iterable<Car> result = repository.findAll(Sort.unsorted());

		System.out.println(result);
	}

}
