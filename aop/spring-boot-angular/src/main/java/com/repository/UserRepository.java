package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.modal.User;

public interface UserRepository extends CrudRepository<User, String> {

}
