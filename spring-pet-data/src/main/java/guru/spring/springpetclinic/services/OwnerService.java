package guru.spring.springpetclinic.services;

import guru.spring.springpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
