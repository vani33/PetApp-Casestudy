package com.hcl.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.hcl.model.Pet;
import com.hcl.repository.PetRepository;


@Repository
public class PetDAOimpl implements PetDAO{

	@Autowired
	PetRepository petRepository;
	@Override
	public void savePet(Pet pet) {
		petRepository.save(pet);
		
	}
	@Override
	public List<Pet> getAllPets() {
		
		List<Pet> list = (List<Pet>) petRepository.findAll();
		return list;
		
	}
	/*@Override
	public void buyPet(int id) {
		petRepository.buyPet(id);
		
	}*/

	
	

	

}
