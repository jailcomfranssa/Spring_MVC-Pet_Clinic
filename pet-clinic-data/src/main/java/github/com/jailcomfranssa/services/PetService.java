package github.com.jailcomfranssa.services;

import github.com.jailcomfranssa.modal.Pet;

import java.util.List;
import java.util.Optional;

public interface PetService {
    Pet save(Pet pet);
    Optional<Pet> findById(Long id);
    void delete(Pet pet);
    List<Pet> findAll();
}
