package com.compy.repository;

import com.compy.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserListRepository extends JpaRepository<Users, Integer> {

}
