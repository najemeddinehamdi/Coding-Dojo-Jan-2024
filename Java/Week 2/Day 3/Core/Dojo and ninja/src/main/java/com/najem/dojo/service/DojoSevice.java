package com.najem.dojo.service;

import com.najem.dojo.model.Dojo;
import com.najem.dojo.model.Ninja;
import com.najem.dojo.repository.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DojoSevice {
    @Autowired
    private DojoRepository dojoRepo;

    //create
    public Dojo createDojo(Dojo dojo) {
        return dojoRepo.save(dojo);
    }
    //all
    public List<Dojo> getAllDojos() {
        return dojoRepo.findAll();
    }


    public Dojo getDojoById(Long id) {
        return dojoRepo.findById(id).get();
    }
}
