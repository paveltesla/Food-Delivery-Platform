package com.example.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.example.userservice.entity.Role;
import  org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface RoleRepository  extends JpaRepository<Role,Long>,JpaSpecificationExecutor<Role>{
    Optional<Role> findByName(String name);
}
