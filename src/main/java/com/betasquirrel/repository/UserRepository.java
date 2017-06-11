package com.betasquirrel.repository;

import com.betasquirrel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Anshad Vattapoyil on 10/06/17 10:05 PM.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
