package com.cmd.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.cmd.db.model.Car;

public interface CarMongoRepository extends CrudRepository<Car, String>{}