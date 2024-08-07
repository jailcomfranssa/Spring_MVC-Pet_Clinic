package github.com.jailcomfranssa.bootstrap;

import github.com.jailcomfranssa.modal.Owner;
import github.com.jailcomfranssa.modal.Vet;
import github.com.jailcomfranssa.services.OwnerService;
import github.com.jailcomfranssa.services.VetService;
import github.com.jailcomfranssa.services.map.OwnerServiceMap;
import github.com.jailcomfranssa.services.map.VetServiceMap;
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

        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Jane");
        owner2.setLastName("Doe");
        ownerService.save(owner2);

        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();

        vet1.setFirstName("John-Vet");
        vet1.setLastName("Doe");
        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Jane-Vet");
        vet2.setLastName("Doe");
        vetService.save(vet2);

        System.out.println("Loaded Vets ...");

    }
}









































