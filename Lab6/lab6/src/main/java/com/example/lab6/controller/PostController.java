package com.example.lab6.controller;

import com.example.lab6.domain.PostInfo;
import com.example.lab6.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController

public class PostController {

    @Autowired
    PostService postService;

    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    @RequestMapping("/posts")
    public List<PostInfo> getAll() {
        return postService.getAll();
    }



    @GetMapping("/posts/{id}")
    public Optional<PostInfo> getById(@PathVariable("id") long id){
        return postService.getById(id);
    }

    @PostMapping( produces = "application/json")
    public PostInfo saveInfo(@RequestBody PostInfo post){
//        post.setDescription("This");
        postService.save(post);

        return post;

    }

//////////////////////Delete///////////

        @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
        public void deletePost(@PathVariable(value = "id") long id){
        postService.delete(id);
        }
/////////////////////Update /////////////
    @RequestMapping(value="/posts/{id}", method = RequestMethod.PUT)
    public PostInfo updatePost(@PathVariable long id,@RequestBody PostInfo post){
        postService.updatePost(id,post);
    return post;
    }
    @GetMapping("/admin")
    public String inValidTest2(){
        return "OK";
    }

    /////////////////User///////////////
    //@RequestMapping(value="/users")


//    @RequestMapping(value="users/{id}")
//    @RequestMapping(value = "users/{id}/posts")




}

