package com.example.API.Repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.API.Model.OwnerEntity;


public interface OwnerRepository extends JpaRepository <Id, Long> {

    OwnerEntity save(OwnerEntity owner);

}
