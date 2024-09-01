package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.model.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // ADD USER
    public User addUser(User user) {
        return userRepository.save(user);
    }
    //GET USER
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User updateUser(User user, int id){
        User updateUser = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not Found"));
        updateUser.setId(user.getId());
        updateUser.setName(user.getName());
        updateUser.setEmail(user.getEmail());
        return userRepository.save(updateUser);
    }
    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

}      
