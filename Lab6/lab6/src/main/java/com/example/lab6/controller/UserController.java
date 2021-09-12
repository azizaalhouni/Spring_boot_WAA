package com.example.lab6.controller;

import com.example.lab6.domain.PostInfo;
import com.example.lab6.domain.UserInfo;
import com.example.lab6.service.PostService;
import com.example.lab6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")

public class UserController {

  @Autowired
  UserService userService;

  @Autowired
    PostService postService;

    @GetMapping
    public List<UserInfo> getAll(){
        return userService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<UserInfo> getById(@PathVariable long id){
        return userService.getById(id);
    }

    @PostMapping
    public void newUser(@RequestBody UserInfo user){
        userService.newUser(user);
    }

    @GetMapping("/{id}/posts")
    public List<PostInfo> postForUser(@PathVariable long id){
        return userService.getPostsById(id);
    }

//    @GetMapping
//    public List<UserInfo> getUserPostMoreThan(@RequestParam("num")int num){
//       return userService.getUserPostMoreThan(num);
//    }
}
