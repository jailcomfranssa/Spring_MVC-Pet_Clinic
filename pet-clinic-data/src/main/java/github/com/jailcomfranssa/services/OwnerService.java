package github.com.jailcomfranssa.services;

import github.com.jailcomfranssa.modal.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    void delete(Owner owner);
}
