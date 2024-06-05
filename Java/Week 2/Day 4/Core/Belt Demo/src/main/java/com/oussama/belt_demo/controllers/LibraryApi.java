package com.oussama.belt_demo.controllers;

import com.oussama.belt_demo.models.Library;
import com.oussama.belt_demo.services.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryApi {
    // DI
    private final LibraryService LibraryService;
    public LibraryApi(LibraryService LibraryService){
        this.LibraryService = LibraryService;
    }

    // READ ALL
    @GetMapping("")
    public List<Library> index() {
        return LibraryService.allLibrary();
    }

    // CREATE
    @PostMapping("")
    public Library create(
            @RequestParam(value="name") String name,
            @RequestParam(value="location") String location
    ) {
        Library Library = new Library( name,location);
        return LibraryService.createLibrary(Library);
    }

    // READ ONE BY ID
    @GetMapping("/{id}")
    public Library show(@PathVariable("id") Long id) {
        return LibraryService.findLibrary(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Library update(@PathVariable("id") Long id, @RequestBody Library LibraryDetails) {
        return LibraryService.updateLibrary(id, LibraryDetails);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        LibraryService.deleteLibrary(id);
    }
}