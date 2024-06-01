package com.najem.burger.service;

import com.najem.burger.model.Burger;
import com.najem.burger.repository.BurgerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;


@Service
public class BurgerService {
    private final BurgerRepo repo;
    private final BurgerRepo burgerRepo;

    public BurgerService(BurgerRepo repo, BurgerRepo burgerRepo) {
        this.repo = repo;
        this.burgerRepo = burgerRepo;
    }

    //create
    public Burger createBurger(Burger burger) {
        return repo.save(burger);
    }
    //readone
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = repo.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        }
        return null;
    }

    //read all
    public List<Burger> findAllBurgers() {
        return repo.findAll();
    }

    //update
    public Burger updateBurger(Burger burger ) {
        return repo.save(burger);
    }


}
