package com.example.API.Service;

import com.example.API.Model.OwnerEntity;
import com.example.API.Model.dto.OwnerDto;
import com.example.API.Repository.OwnerRepository;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService{

    private OwnerRepository ownerRepository;
    public OwnerDto getUser(Long id) {
        Optional<Id> owner = this.ownerRepository.findById(id);
        if (owner.isPresent())
            return OwnerDto.toDto((OwnerEntity) owner.get());
         else
            return null;
    }
    public OwnerDto saveOwner(OwnerDto ownerEntity){
        return OwnerDto.toDto(ownerRepository.save(OwnerEntity.toEntity(ownerEntity)));
    }
    public OwnerDto updateOwner(OwnerDto ownerEntity){
        return OwnerDto.toDto(ownerRepository.save(OwnerEntity.toEntity(ownerEntity)));
    }
    public void delete(Long id){
        ownerRepository.deleteById(id);
    }
   
    

    public List<OwnerEntity> getAllOwners (OwnerDto ownerEntity) {
        return OwnerDto.toDto(ownerRepository.findAll());
        
    }


}
