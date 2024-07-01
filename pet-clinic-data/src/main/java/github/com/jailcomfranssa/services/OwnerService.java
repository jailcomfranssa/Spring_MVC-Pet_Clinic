package github.com.jailcomfranssa.services;

import github.com.jailcomfranssa.modal.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
