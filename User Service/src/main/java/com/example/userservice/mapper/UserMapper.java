package com.example.userservice.mapper;

import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.User;
import org.mapstruct.Mapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;


import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "roles", source = "roles", qualifiedByName = "rolesToString")
    UserDto toDto(User user);

    @Named("roleToString")
    default Set<String> roleToString(Set<com.example.userservice.entity.Role> roles){
        return roles.stream()
                .map(com.example.userservice.entity.Role::getName)
                .collect(Collectors.toSet());
    }

}
