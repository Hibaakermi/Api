package com.example.API.Model;

import com.example.API.Model.dto.OwnerDto;
import jakarta.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Builder

@Getter
@Setter
@Table(name = "Owners")
public class OwnerEntity implements Serializable {

    @Setter

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Setter
    @Column(name = "name")
    private String name;

    @Getter
    @Column(name = "contactInformation")
    private String contactInformation;


    
    public OwnerEntity(Long id, String name, String contactInformation) {
        this.id = id;
        this.name = name;
        this.contactInformation = contactInformation;


    }


    public static OwnerEntity toEntity(OwnerDto dto){
        return OwnerEntity.builder()
                .id(dto.getId())
                .name(dto.getName())
                .contactInformation(dto.getContactInformation())
                .build();
    }

}