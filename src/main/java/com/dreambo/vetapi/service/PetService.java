package com.dreambo.vetapi.service;

import com.dreambo.vetapi.entity.Pet;
import com.dreambo.vetapi.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List<Pet> findAllPets() {
        return this.petRepository.findAll();
    }
    public Pet findById(Integer id) {
        return petRepository.findById(id).orElse(null);
    }
}
