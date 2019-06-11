package com.psf.psfrest.service;

import com.psf.psfrest.entity.User;

public interface IUserService {
    User findUserByEmail(String email);
    void saveNewUser(User user);
}
