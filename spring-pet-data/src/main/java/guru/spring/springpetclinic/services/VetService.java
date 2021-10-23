package guru.spring.springpetclinic.services;

import guru.spring.springpetclinic.models.Pet;
import guru.spring.springpetclinic.models.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
