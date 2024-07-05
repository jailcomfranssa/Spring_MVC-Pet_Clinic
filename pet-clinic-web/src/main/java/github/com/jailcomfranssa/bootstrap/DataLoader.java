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

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jane");
        owner2.setLastName("Doe");
        ownerService.save(owner2);

        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("John");
        vet1.setLastName("Doe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jane");
        vet2.setLastName("Doe");
        vetService.save(vet2);

        System.out.println("Loaded Vets ...");

    }
}









































