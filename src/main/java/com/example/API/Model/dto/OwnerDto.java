package com.example.API.Model.dto;

import com.example.API.Model.OwnerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ListIndexBase;
import org.springframework.data.annotation.Id;

import java.util.List;

import static com.fasterxml.jackson.databind.util.ClassUtil.name;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OwnerDto {
    private Long id;
    private String name;
    private String contactInformation;
    public static OwnerDto toDto(OwnerEntity entity) {
      return OwnerDto.builder()
              .id(entity.getId())
              .name(entity.getName())
              .contactInformation(entity.getContactInformation())
              .build();
    }

    public static List<OwnerEntity> toDto (List<Id> all) {
    return (List<OwnerEntity>) OwnerDto.builder().build();
    }
}
