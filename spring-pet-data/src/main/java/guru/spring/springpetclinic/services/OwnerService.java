package guru.spring.springpetclinic.services;

import guru.spring.springpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String name);
}
