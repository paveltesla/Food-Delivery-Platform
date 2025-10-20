package com.example.userservice.mapper;

import com.example.userservice.dto.AddressDto;
import com.example.userservice.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    @Mapping(target = "id", ignore = true)
    Address toEntity(AddressDto addressDto);

    AddressDto toDto(Address address);
}
