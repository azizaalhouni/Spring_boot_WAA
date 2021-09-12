package com.example.lab6.service;


import com.example.lab6.domain.PostInfo;
import com.example.lab6.domain.UserInfo;
import com.example.lab6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserInfo> getAll(){
        return userRepository.findAll();
    }

    public Optional<UserInfo> getById(long id){
        return userRepository.findById(id);
    }

    public void newUser(UserInfo user){
        userRepository.save(user);
    }

    public List<PostInfo> getPostsById(long id){
        return userRepository.getPostsById(id);
    }

//    public List<UserInfo> getUserPostMoreThan(int num){
//        return userRepository.getUserPostMoreThan(num);
//    }
}
