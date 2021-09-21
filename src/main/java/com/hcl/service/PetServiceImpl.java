package com.hcl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.DAO.PetDAO;
import com.hcl.model.Pet;
@Service
@Transactional
public class PetServiceImpl implements PetService{

	@Autowired
	PetDAO petDAO; 
	@Override
	public void savePet(Pet pet) {
		
		petDAO.savePet(pet);
	}
	@Override
	public List<Pet> getAllPets() {
		
		return petDAO.getAllPets();
	}
	/*@Override
	public void buyPet(int id) {
		petDAO.buyPet(id);
		
	}
	*/

	
	

}
