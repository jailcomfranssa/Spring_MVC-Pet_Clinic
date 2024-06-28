package github.com.jailcomfranssa.services;

import github.com.jailcomfranssa.modal.Vet;

import java.util.List;
import java.util.Optional;

public interface VetService {
    Vet save(Vet vet);
    Optional<Vet> findById(Long id);
    void delete(Vet vet);
    List<Vet> findAll();

}
