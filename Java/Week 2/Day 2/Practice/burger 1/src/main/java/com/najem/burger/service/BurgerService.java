package com.najem.burger.service;

import com.najem.burger.model.Burger;
import com.najem.burger.repository.BurgerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BurgerService {
    @Autowired
    private BurgerRepo BurgerRepo;

    //create
    public Burger createBurger(Burger burger) {
        return BurgerRepo.save(burger);
    }
    //readone
    public Burger findBurgerById(int id) {
        Optional<Burger> Burger = BurgerRepo.findById(id);
        if (Burger.isPresent()) {
            return Burger.get();
        }else {
            return null;
        }
    }

    //read all
    public List<Burger> findAllBurgers() {
        return BurgerRepo.findAll();
    }
}
