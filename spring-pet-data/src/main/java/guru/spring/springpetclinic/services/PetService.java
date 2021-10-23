package guru.spring.springpetclinic.services;

import guru.spring.springpetclinic.models.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
