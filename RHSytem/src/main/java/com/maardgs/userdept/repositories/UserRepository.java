package com.maardgs.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maardgs.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
