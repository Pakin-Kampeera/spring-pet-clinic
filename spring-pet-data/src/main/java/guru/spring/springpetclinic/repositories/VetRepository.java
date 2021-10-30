package guru.spring.springpetclinic.repositories;

import guru.spring.springpetclinic.models.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
