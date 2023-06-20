package io.github.jvwilge.composedemo.repository;

import io.github.jvwilge.composedemo.domain.Car;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends PagingAndSortingRepository<Car, Long> {
}
