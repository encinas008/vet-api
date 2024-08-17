package com.dreambo.vetapi.controller;

import com.dreambo.vetapi.entity.Pet;
import com.dreambo.vetapi.service.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class VetController {


    private PetService petService;


    @GetMapping("mascota/{id_pet}")
    public ResponseEntity<Pet> getPetById(@PathVariable("id_pet") Integer id_pet)
    {
        Pet pet = petService.findById(id_pet);
        return ResponseEntity.ok().body(pet);
    }
    @GetMapping("/mascotas")
    public ResponseEntity<List<Pet>> getAllPet() {
        List<Pet> pets = petService.findAllPets();

        return ResponseEntity.ok().body(pets);
    }

}
