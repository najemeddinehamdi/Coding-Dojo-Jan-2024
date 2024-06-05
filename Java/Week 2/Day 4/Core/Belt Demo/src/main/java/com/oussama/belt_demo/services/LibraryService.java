package com.oussama.belt_demo.services;


import com.oussama.belt_demo.models.Library;
import com.oussama.belt_demo.repositories.LibraryRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    // adding the Library repository as a dependency
    private final LibraryRepo LibraryRepository;

    public LibraryService(LibraryRepo LibraryRepository) {
        this.LibraryRepository = LibraryRepository;
    }

    // ========== CURD =============

    // READ ALL
    public List<Library> allLibrary() {
        return LibraryRepository.findAll();
    }

    // CREATE
    public Library createLibrary(Library l) {
        return LibraryRepository.save(l);
    }

    // READ ONE
    public Library findLibrary(Long id) {
        Optional<Library> optionalLibrary = LibraryRepository.findById(id);
        return optionalLibrary.orElse(null);
    }

    // UPDATE
    public Library updateLibrary(Long id, Library LibraryDetails) {
        Optional<Library> optionalLibrary = LibraryRepository.findById(id);
        if (optionalLibrary.isPresent()) {
            Library Library = optionalLibrary.get();
            Library.setId(LibraryDetails.getId());
            Library.setLocation(LibraryDetails.getLocation());
            return LibraryRepository.save(Library); // Save updates to the repository
        } else {
            // Handle the case where the Library is not found
            return null; // or throw a custom exception
        }
    }

    // DELETE
    public void deleteLibrary(Long id) {
        LibraryRepository.deleteById(id);
    }
}
