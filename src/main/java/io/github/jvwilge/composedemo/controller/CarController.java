package io.github.jvwilge.composedemo.controller;

import io.github.jvwilge.composedemo.domain.Car;
import io.github.jvwilge.composedemo.repository.CarRepository;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CarController {

    private final CarRepository repository;

    public CarController(CarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cars")
    public Iterable<Car> all() {
        return repository.findAll(Sort.unsorted());
    }

}
