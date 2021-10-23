package guru.spring.springpetclinic.services.map;

import guru.spring.springpetclinic.models.Vet;
import guru.spring.springpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Vet findById(Long id) {
        return null;
    }

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Vet object) {

    }
}
