package com.hcl.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.hcl.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{

	/*void buyPet(int id);*/

	//@Query(value = "update Pet p set p.owner=1 where p.id=?1", nativeQuery = true)
	//public void buyPet(int id);
}
