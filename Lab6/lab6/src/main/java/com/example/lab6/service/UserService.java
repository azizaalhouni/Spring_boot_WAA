package com.example.lab6.service;

import com.example.lab6.domain.PostInfo;
import com.example.lab6.domain.UserInfo;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<UserInfo> getAll();

    public Optional<UserInfo> getById(long id);

    public void newUser(UserInfo user);

    public List<PostInfo> getPostsById(long id);

//    public List<UserInfo> getUserPostMoreThan(int num);
}
