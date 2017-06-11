package com.betasquirrel.repository;

import com.betasquirrel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Anshad Vattapoyil on 10/06/17 10:05 PM.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Modifying
    @Transactional
    @Query("update User user set user.name=:name, user.email=:email, user.mobile=:mobile where user.id=:id")
    void updateUser(@Param("name") String name, @Param("email") String email,
                    @Param("mobile") String mobile, @Param("id") Integer id);
}
