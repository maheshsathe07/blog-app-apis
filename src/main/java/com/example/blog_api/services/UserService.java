package com.example.blog_api.services;

import com.example.blog_api.payloads.UserDto;

import java.util.List;

// for transfer data we will use DTO, no need to expose Entity
public interface UserService {
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user, Integer userId);
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);
}
