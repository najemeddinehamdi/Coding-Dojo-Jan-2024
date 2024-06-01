package com.najem.travels.service;

import com.najem.travels.model.Travels;
import com.najem.travels.repository.TravelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelService {
    @Autowired
    private TravelRepo travelRepo;

    //CREATE
    public Travels createTravel(Travels travel) {
        return travelRepo.save(travel);
    }
    //READ All
    public List<Travels> getAllTravels() {
        return travelRepo.findAll();
    }
    //READ ONE
    public Travels getTravelById(Long id) {
        Optional<Travels> travel = travelRepo.findById(id);
        if (travel.isPresent()) {
            return travel.get();
        }else {
            return null;
        }
    }
    //Update
    public Travels updateTravel(Travels travel) {
        return travelRepo.save(travel);
    }
    //DELETE
    public void deleteTravel(Long id) {
        travelRepo.deleteById(id);
    }

}
