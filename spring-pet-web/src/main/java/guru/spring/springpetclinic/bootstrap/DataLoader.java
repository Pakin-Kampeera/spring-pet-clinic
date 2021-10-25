package guru.spring.springpetclinic.bootstrap;

import guru.spring.springpetclinic.models.Owner;
import guru.spring.springpetclinic.models.Vet;
import guru.spring.springpetclinic.services.OwnerService;
import guru.spring.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Winston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Pakin");
        owner2.setLastName("Kampeera");

        ownerService.save(owner2);

        System.out.println("Loaded Owner...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sim");
        vet1.setLastName("Son");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Steve");
        vet2.setLastName("Jobs");

        vetService.save(vet2);

        System.out.println("Loaded Vet...");
    }
}
