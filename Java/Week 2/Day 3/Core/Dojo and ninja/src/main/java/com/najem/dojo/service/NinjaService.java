package com.najem.dojo.service;

import com.najem.dojo.model.Dojo;
import com.najem.dojo.model.Ninja;
import com.najem.dojo.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepo;

    //create
    public Ninja createNinja(Ninja ninja) {

        return ninjaRepo.save(ninja);
    }

    //all
    public List<Ninja> getAllNinjas() {
        return ninjaRepo.findAll();
    }


}
