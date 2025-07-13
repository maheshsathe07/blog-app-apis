package com.example.blog_api.controllers;

import com.example.blog_api.payloads.ApiResponse;
import com.example.blog_api.payloads.UserDto;
import com.example.blog_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    // POST: create-user
    @PostMapping("/") // this will be the route for this endpoint
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        UserDto createdUser = this.userService.createUser(userDto);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    // PUT: update-user
    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable("userId") Integer uid){
         // if variable name is not same then need to pass PathVariable name, here userId mapping to uid
        UserDto updatedUser = this.userService.updateUser(userDto, uid);
        return ResponseEntity.ok(updatedUser);
    }

    // DELETE: delete-user
    @DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer userId){
        this.userService.deleteUser(userId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully", true), HttpStatus.OK);
    }

    // GET: get-users
    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getUsers(){
        List<UserDto> users = this.userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    // GET: get-single-user
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId){
        UserDto user = this.userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }
}
