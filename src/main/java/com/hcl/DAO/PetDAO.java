package com.hcl.DAO;

import java.util.List;

import com.hcl.model.Pet;

public interface PetDAO {

	public void savePet(Pet pet);

	public List<Pet> getAllPets();

	/*public void buyPet(int id);*/
}
