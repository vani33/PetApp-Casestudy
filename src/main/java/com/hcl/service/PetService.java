package com.hcl.service;

import java.util.List;


import com.hcl.model.Pet;

public interface PetService {

	public void savePet(Pet pet);

	public List<Pet> getAllPets();
	
	/*public void buyPet(int id);*/
	
}
