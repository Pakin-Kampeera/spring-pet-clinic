package guru.spring.springpetclinic.repositories;

import guru.spring.springpetclinic.models.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
