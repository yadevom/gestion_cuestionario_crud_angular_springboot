package com.sistema.examenes.services;

import com.sistema.examenes.models.User;
import com.sistema.examenes.models.UserRole;

import java.util.Set;

public interface UserService {

    public User saveUser(User user, Set<UserRole> userRoles) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);
}
