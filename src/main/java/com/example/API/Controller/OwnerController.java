package com.example.API.Controller;

import com.example.API.Model.dto.OwnerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API.Model.OwnerEntity;
import com.example.API.Service.OwnerService;

import java.util.List;


@RestController
@RequestMapping("/Owner")


public class OwnerController {
    private OwnerService ownerService;
    @GetMapping("/getUser")
    public OwnerDto getUser(Long id){
        return ownerService.getUser(id);
    }

    @PostMapping("/saveOwner")
    public OwnerDto save(@RequestBody OwnerDto ownerEntity){
        return ownerService.saveOwner(ownerEntity);
    }
    @PostMapping("/updateOwner")
    public OwnerDto update(@RequestBody OwnerDto ownerEntity){
        return ownerService.updateOwner(ownerEntity);
    }
    @GetMapping("/deleteOwner")
    public void delete(@RequestBody Long id){
    }
    @GetMapping("/getAll")
    public List<OwnerEntity> getAll(@RequestBody OwnerDto ownerEntity){
        return ownerService.getAllOwners(ownerEntity);
    }
}


