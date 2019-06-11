package com.psf.psfrest.service;

import com.psf.psfrest.entity.User;
import com.psf.psfrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmailEquals(email);
    }

    @Override
    public void saveNewUser(User user) {
        userRepository.save(user);
    }


}
