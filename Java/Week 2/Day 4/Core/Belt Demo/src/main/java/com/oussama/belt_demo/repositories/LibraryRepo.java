package com.oussama.belt_demo.repositories;

import com.oussama.belt_demo.models.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepo extends CrudRepository<Library, Long> {
    List<Library> findAll();
}
