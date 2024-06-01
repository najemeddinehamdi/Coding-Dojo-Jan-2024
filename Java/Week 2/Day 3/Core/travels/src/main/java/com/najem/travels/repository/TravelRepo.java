package com.najem.travels.repository;

import com.najem.travels.model.Travels;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TravelRepo extends CrudRepository<Travels,Long> {
    List<Travels>findAll();
}
