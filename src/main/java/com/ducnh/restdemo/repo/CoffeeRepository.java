package com.ducnh.restdemo.repo;

import com.ducnh.restdemo.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
