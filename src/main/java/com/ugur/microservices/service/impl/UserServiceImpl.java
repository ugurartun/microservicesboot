package com.ugur.microservices.service.impl;

import com.ugur.microservices.domain.User;
import com.ugur.microservices.repository.UserRepository;
import com.ugur.microservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getByPhone(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.delete(id);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }



}
