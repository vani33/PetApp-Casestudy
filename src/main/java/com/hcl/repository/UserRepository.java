package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;


import com.hcl.model.User;

public interface UserRepository  extends CrudRepository<User, Long>{

}
