package com.example.userservice.repository;

import com.example.userservice.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

    List<Address> findByUserId(Long userId);
    void deleteByUserIdAndId(Long userId, Long addressId);

}
