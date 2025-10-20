package com.example.userservice.mapper;

import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.Role;
import com.example.userservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "roles", expression = "java(rolesToString(user.getRoles()))")
    UserDto toDto(User user);

    default Set<String> rolesToString(Set<Role> roles){
        if (roles == null){
            return Set.of();
        }
        return roles.stream()
                .map(Role::getName)
                .collect(Collectors.toSet());
    }
}