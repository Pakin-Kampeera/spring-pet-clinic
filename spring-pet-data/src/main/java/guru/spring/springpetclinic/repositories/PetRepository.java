package guru.spring.springpetclinic.repositories;

import guru.spring.springpetclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
