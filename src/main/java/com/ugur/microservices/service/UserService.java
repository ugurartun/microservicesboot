package com.ugur.microservices.service;

import com.ugur.microservices.domain.User;

public interface UserService {

    void saveUser(User user);

    User getByPhone(String phoneNumber);

    void deleteUserById(Long id);

    void deleteUser(User user);
}
