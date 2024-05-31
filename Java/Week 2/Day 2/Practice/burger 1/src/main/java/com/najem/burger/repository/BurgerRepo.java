package com.najem.burger.repository;

import com.najem.burger.model.Burger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BurgerRepo extends CrudRepository<Burger, Integer> {
    List<Burger> findAll();
}
