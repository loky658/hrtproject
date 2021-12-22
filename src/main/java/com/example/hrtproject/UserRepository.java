package com.example.hrtproject;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {
    
    public User findById(int id);
       public User findByName(String nome);

}
