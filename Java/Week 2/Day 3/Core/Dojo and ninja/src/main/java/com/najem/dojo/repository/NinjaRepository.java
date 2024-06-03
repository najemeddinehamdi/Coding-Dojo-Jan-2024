package com.najem.dojo.repository;

import com.najem.dojo.model.Ninja;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();

}
