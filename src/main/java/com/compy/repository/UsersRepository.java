package com.compy.repository;

import com.compy.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByEmail(String email);

}
